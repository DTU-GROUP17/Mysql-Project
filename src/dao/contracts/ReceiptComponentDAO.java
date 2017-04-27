package dao.contracts;

import java.util.List;

import connectors.DALException;
import dto.ReceiptComponent;

public interface ReceiptComponentDAO {
	ReceiptComponent findByReceiptAndMaterial(int receptId, int raavareId) throws DALException;

	List<ReceiptComponent> findByReceipt(int receptId) throws DALException;

	List<ReceiptComponent> all() throws DALException;

	void create(ReceiptComponent receptkomponent) throws DALException;

	void update(ReceiptComponent receptkomponent) throws DALException;
}
