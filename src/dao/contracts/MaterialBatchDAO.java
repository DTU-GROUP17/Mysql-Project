package dao.contracts;

import java.util.List;

import connectors.DALException;
import dto.MaterialBatch;

public interface MaterialBatchDAO {
	MaterialBatch find(int rbId) throws DALException;

	List<MaterialBatch> all() throws DALException;

	List<MaterialBatch> findByMaterial(int raavareId) throws DALException;

	void create(MaterialBatch raavarebatch) throws DALException;

	void update(MaterialBatch raavarebatch) throws DALException;
}

