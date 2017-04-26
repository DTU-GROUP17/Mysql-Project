package dao.SQL;

import connectors.DALException;
import dao.contracts.ReceiptComponentDAO;
import dto.ReceiptComponent;

import java.util.List;

public class SQLReceiptComponent implements ReceiptComponentDAO{
	@Override
	public ReceiptComponent findByReceiptAndMaterial(int receptId, int raavareId) throws DALException {
		return null;
	}

	@Override
	public List<ReceiptComponent> findByRecept(int receptId) throws DALException {
		return null;
	}

	@Override
	public List<ReceiptComponent> all() throws DALException {
		return null;
	}

	@Override
	public void create(ReceiptComponent receptkomponent) throws DALException {

	}

	@Override
	public void update(ReceiptComponent receptkomponent) throws DALException {

	}
}
