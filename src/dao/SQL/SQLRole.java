package dao.SQL;

import connectors.DALException;
import dao.contracts.RoleDAO;
import dto.Role;

import java.util.List;

public class SQLRole implements RoleDAO{
	@Override
	public Role find(int id) throws DALException {
		return null;
	}

	@Override
	public List<Role> all() throws DALException {
		return null;
	}

	@Override
	public void create(Role role) throws DALException {

	}

	@Override
	public void update(Role role) throws DALException {

	}
}
