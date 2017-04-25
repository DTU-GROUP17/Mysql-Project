package dao.SQL;

import connectors.Connector;
import connectors.DALException;
import dao.contracts.ReceiptDAO;
import dto.Receipt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLReceipt implements ReceiptDAO {
	@Override
	public Receipt find(int id) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT id, name FROM receipt WHERE id = " + id);

		try {
			if (!rs.first()) throw new DALException("Receipt with id="+id+" does not exist.");
			return new Receipt(
					rs.getInt("id"),
					rs.getString("name")
			);
		} catch (SQLException e) {
			throw new DALException(e);
		}

	}

	@Override
	public void create(Receipt receipt) throws DALException {
		Connector.doUpdate(
				String.format("CALL createReceipt(%d,'%s');",
						receipt.getId(),
						receipt.getName()
				)
		);
	}

	@Override
	public void update(Receipt receipt) throws DALException {
		Connector.doUpdate(
				String.format("CALL updateReceipt(%d,'%s');",
						receipt.getId(),
						receipt.getName()
				)
		);
	}

	public List<Receipt> all() throws DALException {
		List<Receipt> list = new ArrayList<>();
		ResultSet rs = Connector.doQuery("SELECT id, name FROM receipt");
		try {
			while (rs.next()) {
				list.add(
						new Receipt(
								rs.getInt("id"),
								rs.getString("name")
						)
				);
			}
		} catch (SQLException e) {
			throw new DALException(e);
		}
		return list;
	}
}
