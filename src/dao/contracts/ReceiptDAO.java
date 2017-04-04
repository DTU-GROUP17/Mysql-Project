package dao.contracts;

import java.util.List;

import connectors.DALException;
import dto.Receipt;

public interface ReceiptDAO {
	Receipt find(int receptId) throws DALException;

	List<Receipt> all() throws DALException;

	void create(Receipt recept) throws DALException;

	void update(Receipt recept) throws DALException;
}
