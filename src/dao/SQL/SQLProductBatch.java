package dao.SQL;

import connectors.Connector;
import connectors.DALException;
import dao.contracts.ProductBatchDAO;
import dto.Operator;
import dto.ProductBatch;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLProductBatch implements ProductBatchDAO {
	@Override
	public ProductBatch find(int id) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT id, status, receiptId FROM productBatch WHERE id = " + id);

		try {
			if (!rs.first()) throw new DALException("Product batch with id="+id+" does not exist.");
			return new ProductBatch(
					rs.getInt("id"),
					rs.getInt("status"),
					rs.getInt("receiptId")
			);
		} catch (SQLException e) {
			throw new DALException(e);
		}
	}

	@Override
	public List<ProductBatch> all() throws DALException {
		List<ProductBatch> list = new ArrayList<>();
		ResultSet rs = Connector.doQuery("SELECT id, status, receiptId FROM productBatch");
		try {
			while (rs.next()) {
				list.add(
						new ProductBatch(
								rs.getInt("id"),
								rs.getInt("status"),
								rs.getInt("receiptId")
						)
				);
			}
		} catch (SQLException e) {
			throw new DALException(e);
		}
		return list;
	}

	@Override
	public void create(ProductBatch productBatch) throws DALException {
		Connector.doUpdate(
				String.format("CALL createProductBatch(%d, %d, %d);",
						productBatch.getId(),
						productBatch.getStatus(),
						productBatch.getReceiptId()
				)
		);
	}

	@Override
	public void update(ProductBatch productBatch) throws DALException {
		Connector.doUpdate(
				String.format("CALL updateProductBatch(%d, %d, %d);",
						productBatch.getId(),
						productBatch.getStatus(),
						productBatch.getReceiptId()
				)
		);
	}
}
