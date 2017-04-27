package dao.SQL;

import connectors.Connector;
import connectors.DALException;
import dao.contracts.ReceiptComponentDAO;
import dto.Receipt;
import dto.ReceiptComponent;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLReceiptComponent implements ReceiptComponentDAO{
	@Override
	public ReceiptComponent findByReceiptAndMaterial(int receiptId, int materialId) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT receiptId, materialId, netto, tolerance FROM receiptComponent WHERE receiptId = " + receiptId + " AND materialId = "+ materialId);

		try {
			if (!rs.first())
				throw new DALException("Receipt component with receipt id="+receiptId+" and material id="+materialId+" does not exist.");
			return new ReceiptComponent(
					rs.getInt("receiptId"),
					rs.getInt("materialId"),
					rs.getDouble("netto"),
					rs.getDouble("tolerance")
			);
		} catch (SQLException e) {
			throw new DALException(e);
		}
	}

	@Override
	public List<ReceiptComponent> findByReceipt(int receiptId) throws DALException {
		List<ReceiptComponent> list = new ArrayList<>();
		ResultSet rs = Connector.doQuery("SELECT receiptId, materialId, netto, tolerance FROM receiptComponent WHERE receiptId="+receiptId);
		try {
			while (rs.next()) {
				list.add(
						new ReceiptComponent(
								rs.getInt("receiptId"),
								rs.getInt("materialId"),
								rs.getDouble("netto"),
								rs.getDouble("tolerance")
						)
				);
			}
		} catch (SQLException e) {
			throw new DALException(e);
		}
		return list;
	}


	@Override
	public List<ReceiptComponent> all() throws DALException {
		List<ReceiptComponent> list = new ArrayList<>();
		ResultSet rs = Connector.doQuery("SELECT receiptId, materialId, netto, tolerance FROM receiptComponent");
		try {
			while (rs.next()) {
				list.add(
						new ReceiptComponent(
								rs.getInt("receiptId"),
								rs.getInt("materialId"),
								rs.getDouble("netto"),
								rs.getDouble("tolerance")
						)
				);
			}
		} catch (SQLException e) {
			throw new DALException(e);
		}
		return list;
	}

	@Override
	public void create(ReceiptComponent receiptComponent) throws DALException {
		Connector.doUpdate(
				String.format("CALL createReceiptComponent(%d, %d, %f, %f);",
						receiptComponent.getReceiptId(),
						receiptComponent.getMaterialId(),
						receiptComponent.getNomNetto(),
						receiptComponent.getTolerance()
				)
		);
	}

	@Override
	public void update(ReceiptComponent receiptComponent) throws DALException {
		Connector.doUpdate(
				String.format("CALL updateReceiptComponent(%d, %d, %f, %f);",
						receiptComponent.getReceiptId(),
						receiptComponent.getMaterialId(),
						receiptComponent.getNomNetto(),
						receiptComponent.getTolerance()
				)
		);
	}
}
