package dao.SQL;

import connectors.Connector;
import connectors.DALException;
import dao.contracts.MaterialBatchDAO;
import dao.contracts.MaterialDAO;
import dto.Material;
import dto.MaterialBatch;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLMaterialBatch implements MaterialBatchDAO{

	@Override
	public MaterialBatch find(int id) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT id, materialId, amount FROM materialBatch WHERE id =" + id);

		try {
			if (!rs.first()) throw new DALException("Material batch with id="+id+" does not exist.");
			return new MaterialBatch(
					rs.getInt("id"),
					rs.getInt("materialId"),
					rs.getDouble("amount")
			);
		} catch (SQLException e) {
			throw new DALException(e);
		}
	}


	@Override
	public void create(MaterialBatch materialBatch) throws DALException {
		Connector.doUpdate(
				String.format("CALL createMaterialBatch(%d,'%d','%d');",
						materialBatch.getId(),
						materialBatch.getMaterialId(),
						materialBatch.getAmount()
				)
		);
	}

	@Override
	public void update(MaterialBatch materialBatch) throws DALException {
		Connector.doUpdate(
				String.format("CALL updateMaterialBatch(%d,'%d','%s');",
						materialBatch.getId(),
						materialBatch.getMaterialId(),
						materialBatch.getAmount()
				)
		);
	}

	@Override
	public List<MaterialBatch> all() throws DALException {
		List<MaterialBatch> list = new ArrayList<>();
		ResultSet rs = Connector.doQuery("SELECT id, materialId, amount FROM materialBatch");
		try {
			while (rs.next()) {
				list.add(
						new MaterialBatch(
								rs.getInt("id"),
								rs.getInt("materialId"),
								rs.getDouble("amount")
						)
				);
			}
		} catch (SQLException e) {
			throw new DALException(e);
		}
		return list;
	}

	@Override
	public List<MaterialBatch> findByMaterial(int materialId) throws DALException {
		List<MaterialBatch> list = new ArrayList<>();
		ResultSet rs = Connector.doQuery("SELECT id, materialId, amount FROM materialBatch"); //TODO limit by material
		try {
			while (rs.next()) {
				list.add(
						new MaterialBatch(
								rs.getInt("id"),
								rs.getInt("materialId"),
								rs.getDouble("amount")
						)
				);
			}
		} catch (SQLException e) {
			throw new DALException(e);
		}
		return list;
	}

}
