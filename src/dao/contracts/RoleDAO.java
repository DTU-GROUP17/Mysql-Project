package dao.contracts;

import connectors.DALException;
import dto.Role;

import java.util.List;

public interface RoleDAO {
	Role find(int id) throws DALException;

	List<Role> all() throws DALException;

	void create(Role role) throws DALException;

	void update(Role role) throws DALException;
}
