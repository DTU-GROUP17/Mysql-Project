package dao.SQL;

import connectors.DALException;
import dao.contracts.ProductBatchDAO;
import dto.ProductBatch;

import java.util.List;

public class SQLProductBatch implements ProductBatchDAO {
	@Override
	public ProductBatch find(int pbId) throws DALException {
		return null;
	}

	@Override
	public List<ProductBatch> all() throws DALException {
		return null;
	}

	@Override
	public void create(ProductBatch produktbatch) throws DALException {

	}

	@Override
	public void update(ProductBatch produktbatch) throws DALException {

	}
}
