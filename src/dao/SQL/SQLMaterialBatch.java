package dao.SQL;

import connectors.DALException;
import dao.contracts.MaterialDAO;
import dto.Material;

import java.util.List;

public class SQLMaterialBatch implements MaterialDAO {
	@Override
	public Material find(int id) throws DALException {
		return null;
	}

	@Override
	public List<Material> all() throws DALException {
		return null;
	}

	@Override
	public void create(Material material) throws DALException {

	}

	@Override
	public void update(Material material) throws DALException {

	}
}
