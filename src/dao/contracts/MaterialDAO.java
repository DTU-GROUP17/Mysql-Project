package dao.contracts;

import java.util.List;

import connectors.DALException;
import dto.Material;

public interface MaterialDAO {
	Material find(int id) throws DALException;

	List<Material> all() throws DALException;

	void create(Material material) throws DALException;

	void update(Material material) throws DALException;
}
