package dao.SQL;

import connectors.Connector;
import connectors.DALException;
import dao.contracts.RoleDAO;
import dto.Receipt;
import dto.Role;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLRole implements RoleDAO{
	@Override
	public Role find(int id) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT id, name FROM role WHERE id = " + id);

		try {
			if (!rs.first()) throw new DALException("Rolet with id="+id+" does not exist.");
			return new Role(
					rs.getInt("id"),
					rs.getString("name")
			);
		} catch (SQLException e) {
			throw new DALException(e);
		}
	}

	@Override
	public List<Role> all() throws DALException {
		List<Role> list = new ArrayList<>();
		ResultSet rs = Connector.doQuery("SELECT id, name FROM role");
		try {
			while (rs.next()) {
				list.add(
						new Role(
								rs.getInt("id"),
								rs.getString("name")
						)
				);
			}
		} catch (SQLException e) {
			throw new DALException(e);
		}
		return list;
	}

	@Override
	public void create(Role role) throws DALException {
		Connector.doUpdate(
				String.format("CALL createRole(%d,'%s');",
						role.getId(),
						role.getName()
				)
		);
	}

	@Override
	public void update(Role role) throws DALException {
		Connector.doUpdate(
				String.format("CALL updateRole(%d,'%s');",
						role.getId(),
						role.getName()
				)
		);
	}
}