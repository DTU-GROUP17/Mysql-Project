package dao.SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connector01917.Connector;
import daointerfaces01917.DALException;
import daointerfaces01917.ReceptKompDAO;
import dto01917.ReceptKompDTO;

public class MySQLReceptKompDAO implements ReceptKompDAO {

	@Override
	public ReceptKompDTO getReceptKomp(int receptId, int raavareId) throws DALException {

		ResultSet rs = Connector.doQuery(
				"SELECT * FROM receptkomponent WHERE recept_id = " + receptId + " AND raavare_id = " + raavareId);
		try {
			if (!rs.first())
				throw new DALException(
						"Receptkomponent med receptId " + receptId + " og raavareId " + raavareId + " findes ikke");
			return new ReceptKompDTO(rs.getInt("recept_id"), rs.getInt("raavare_id"), rs.getInt("nom_netto"),
					rs.getInt("tolerance"));
		} catch (SQLException e) {
			throw new DALException(e);
		}

	}

	@Override
	public List<ReceptKompDTO> getReceptKompList(int receptId) throws DALException {
		List<ReceptKompDTO> list = new ArrayList<ReceptKompDTO>();
		ResultSet rs = Connector.doQuery("SELECT * from receptkomponent WHERE recept_id = " + receptId);
		try {
			while (rs.next())
				list.add(new ReceptKompDTO(rs.getInt("recept_id"), rs.getInt("raavare_id"), rs.getInt("nom_netto"),
						rs.getInt("tolerance")));
		} catch (SQLException e) {
			throw new DALException(e);

		}

		return list;
	}

	@Override
	public List<ReceptKompDTO> getReceptKompList() throws DALException {
		List<ReceptKompDTO> list = new ArrayList<ReceptKompDTO>();
		ResultSet rs = Connector.doQuery("SELECT * from receptkomponent");
		try {
			while (rs.next())
				list.add(new ReceptKompDTO(rs.getInt("recept_id"), rs.getInt("raavare_id"), rs.getInt("nom_netto"),
						rs.getInt("tolerance")));
		} catch (SQLException e) {
			throw new DALException(e);

		}

		return list;
	}

	@Override
	public void createReceptKomp(ReceptKompDTO receptkomponent) throws DALException {
		Connector.doUpdate("INSERT INTO receptkomp(recept_id, raavare_id, nom_netto, tolerance) VALUES " + "("
				+ receptkomponent.getReceptId() + ", " + receptkomponent.getRaavareId() + ", "
				+ receptkomponent.getNomNetto() + ", " + receptkomponent.getTolerance() + ")");

	}

	@Override
	public void updateReceptKomp(ReceptKompDTO receptkomponent) throws DALException {
		Connector.doUpdate("UPDATE receptkomponent SET recept_id = " + receptkomponent.getReceptId() + ", "
				+ receptkomponent.getRaavareId() + ", " + receptkomponent.getNomNetto() + ", "
				+ receptkomponent.getTolerance() + " WHERE recept_id = " + receptkomponent.getReceptId());
	}
}