package dao.contracts;

import java.util.List;

import connectors.DALException;
import dto.ProductBatch;

public interface ProductBatchDAO {
	ProductBatch find(int pbId) throws DALException;

	List<ProductBatch> all() throws DALException;

	void create(ProductBatch produktbatch) throws DALException;

	void update(ProductBatch produktbatch) throws DALException;
}