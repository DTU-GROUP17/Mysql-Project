package dao.SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import connectors.Connector;

import connectors.DALException;
import dao.contracts.OperatorDAO;
import dto.Operator;

public class SQLOperator implements OperatorDAO {
	public Operator find(int id) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT id, name, ini, cpr, password FROM operator WHERE id = "+id);

		try {
			if (!rs.first()) throw new DALException("Operatoeren med id=" + id + " findes ikke");
			return new Operator(
				rs.getInt("id"),
				rs.getString("name"),
				rs.getString("ini"),
				rs.getString("cpr"),
				rs.getString("password")
			);
		} catch (SQLException e) {
			throw new DALException(e);
		}

	}

	public void create(Operator opr) throws DALException {
		Connector.doUpdate(
		"INSERT INTO operator (id, name, ini, cpr, password) VALUES " +
				"(" + opr.getId() + "," +
				"'" + opr.getName() + "'," +
				"'" + opr.getIni() + "'," +
				"'" + opr.getCpr() + "'," +
				"'" + opr.getPassword() + "'" +
				")"
		);
	}

	public void update(Operator opr) throws DALException {
		Connector.doUpdate(
				"UPDATE operator SET name = '" + opr.getName() + "', ini =  '" + opr.getIni() +
						"', cpr = '" + opr.getCpr() + "', password = '" + opr.getPassword() + "' WHERE id = " +
						opr.getId()
		);
	}

	public List<Operator> all() throws DALException {
		List<Operator> list = new ArrayList<Operator>();
		ResultSet rs = Connector.doQuery("SELECT id, name, ini, cpr, password FROM operator");
		try {
			while (rs.next()) {
				list.add(
					new Operator(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getString("ini"),
						rs.getString("cpr"),
						rs.getString("password")
					)
				);
			}
		} catch (SQLException e) {
			throw new DALException(e);
		}
		return list;
	}


}
	
