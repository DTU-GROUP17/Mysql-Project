package dao.SQL;

import connectors.DALException;
import dao.contracts.ProductBatchComponentDAO;
import dto.ProductBatchComponent;

import java.util.List;

public class SQLProductBatchComponent implements ProductBatchComponentDAO {
	@Override
	public ProductBatchComponent find(int pbId, int rbId) throws DALException {
		return null;
	}

	@Override
	public List<ProductBatchComponent> findByProductBatch(int pbId) throws DALException {
		return null;
	}

	@Override
	public List<ProductBatchComponent> all() throws DALException {
		return null;
	}

	@Override
	public void create(ProductBatchComponent produktbatchkomponent) throws DALException {

	}

	@Override
	public void update(ProductBatchComponent produktbatchkomponent) throws DALException {

	}
}
