package dao.contracts;

import java.util.List;

import connectors.DALException;
import dto.Material;

public interface MaterialDAO {
	Material find(int raavareId) throws DALException;

	List<Material> all() throws DALException;

	void create(Material raavare) throws DALException;

	void update(Material raavare) throws DALException;
}
