package dao.SQL;

import connectors.Connector;
import connectors.DALException;
import dao.contracts.ProductBatchComponentDAO;
import dto.ProductBatch;
import dto.ProductBatchComponent;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLProductBatchComponent implements ProductBatchComponentDAO {
	@Override
	public ProductBatchComponent find(int productBatchId, int materialBatchId) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT productBatchId, materialBatchId, tara, netto, operatorId FROM productBatchComponent WHERE productBatchId = " + productBatchId + " AND materialBatchId = " + materialBatchId);
		try {
			if (!rs.first()) throw new DALException("Product batch component with productBatchId="+productBatchId+" and materialBatchId="+materialBatchId+" does not exist.");
			return new ProductBatchComponent(
					rs.getInt("productBatchId"),
					rs.getInt("materialBatchId"),
					rs.getDouble("tara"),
					rs.getDouble("netto"),
					rs.getInt("operatorId")
			);
		} catch (SQLException e) {
			throw new DALException(e);
		}
	}

	@Override
	public List<ProductBatchComponent> findByProductBatch(int pbId) throws DALException {
		List<ProductBatchComponent> list = new ArrayList<>();
		ResultSet rs = Connector.doQuery("SELECT productBatchId, materialBatchId, tara, netto, operatorId FROM productBatchComponent WHERE productBatchId = " + pbId);
		try {
			while (rs.next()) {
				list.add(
					new ProductBatchComponent(
							rs.getInt("productBatchId"),
							rs.getInt("materialBatchId"),
							rs.getDouble("tara"),
							rs.getDouble("netto"),
							rs.getInt("operatorId")
					)
				);
			}
		} catch (SQLException e) {
			throw new DALException(e);
		}
		return list;
	}



	@Override
	public List<ProductBatchComponent> all() throws DALException {
		List<ProductBatchComponent> list = new ArrayList<>();
		ResultSet rs = Connector.doQuery("SELECT productBatchId, materialBatchId, tara, netto, operatorId FROM productBatchComponent");
		try {
			while (rs.next()) {
				list.add(
						new ProductBatchComponent(
								rs.getInt("productBatchId"),
								rs.getInt("materialBatchId"),
								rs.getDouble("tara"),
								rs.getDouble("netto"),
								rs.getInt("operatorId")
						)
				);
			}
		} catch (SQLException e) {
			throw new DALException(e);
		}
		return list;
	}

	@Override
	public void create(ProductBatchComponent productBatchComponent) throws DALException {
		Connector.doUpdate(
				String.format("CALL createProductBatchComponent(%d, %d, %f, %f, %d);",
						productBatchComponent.getProductBatchId(),
						productBatchComponent.getMaterialBatchId(),
						productBatchComponent.getTara(),
						productBatchComponent.getNetto(),
						productBatchComponent.getOperatorId()
				)
		);
	}

	@Override
	public void update(ProductBatchComponent productBatchComponent) throws DALException {
		Connector.doUpdate(
				String.format("CALL updateProductBatchComponent(%d, %d, %f, %f, %d);",
						productBatchComponent.getProductBatchId(),
						productBatchComponent.getMaterialBatchId(),
						productBatchComponent.getTara(),
						productBatchComponent.getNetto(),
						productBatchComponent.getOperatorId()
				)
		);
	}
}
