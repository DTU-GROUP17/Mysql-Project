package dao.contracts;

import java.util.List;

import connectors.DALException;
import dto.ProductBatchComponent;

public interface ProductBatchComponentDAO {
	ProductBatchComponent find(int pbId, int rbId) throws DALException;

	List<ProductBatchComponent> findByProductBatch(int pbId) throws DALException;

	List<ProductBatchComponent> all() throws DALException;

	void create(ProductBatchComponent produktbatchkomponent) throws DALException;

	void update(ProductBatchComponent produktbatchkomponent) throws DALException;
}

