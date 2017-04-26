package dao.SQL;

import connectors.Connector;
import connectors.DALException;
import dao.contracts.MaterialDAO;
import dto.Material;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLMaterial implements MaterialDAO {

	@Override
	public Material find(int id) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT id, name, supplier FROM material WHERE id = " + id);

		try {
			if (!rs.first()) throw new DALException("Material with id="+id+" does not exist.");
			return new Material(
					rs.getInt("id"),
					rs.getString("name"),
					rs.getString("supplier")
			);
		} catch (SQLException e) {
			throw new DALException(e);
		}
	}

	@Override
	public void create(Material material) throws DALException {
		Connector.doUpdate(
				String.format("CALL createMaterial(%d,'%s','%s');",
						material.getId(),
						material.getName(),
						material.getSupplier()
				)
		);
	}

	@Override
	public void update(Material material) throws DALException {
		Connector.doUpdate(
				String.format("CALL updateMaterial(%d,'%s','%s');",
						material.getId(),
						material.getName(),
						material.getSupplier()
				)
		);
	}

	public List<Material> all() throws DALException {
		List<Material> list = new ArrayList<>();
		ResultSet rs = Connector.doQuery("SELECT id, name, supplier FROM material");
		try {
			while (rs.next()) {
				list.add(
						new Material(
								rs.getInt("id"),
								rs.getString("name"),
								rs.getString("supplier")
						)
				);
			}
		} catch (SQLException e) {
			throw new DALException(e);
		}
		return list;
	}
}
