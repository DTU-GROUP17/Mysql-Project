package dao.SQL;

import connectors.Connector;
import connectors.DALException;
import dao.contracts.OperatorDAO;
import dto.Operator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLOperator implements OperatorDAO {

	@Override
	public Operator find(int id) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT id, name, ini, cpr, password FROM operator WHERE id = " + id);

		try {
			if (!rs.first()) throw new DALException("operator with id="+id+" does not exist.");
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

	@Override
	public void create(Operator opr) throws DALException {
		Connector.doUpdate(
				String.format("CALL createOperator(%d,'%s','%s','%s','%s');",
						opr.getId(),
						opr.getName(),
						opr.getIni(),
						opr.getCpr(),
						opr.getPassword()
				)
		);
	}

	@Override
	public void update(Operator opr) throws DALException {
		Connector.doUpdate(
				String.format("CALL updateOperator(%d,'%s','%s','%s','%s');",
						opr.getId(),
						opr.getName(),
						opr.getIni(),
						opr.getCpr(),
						opr.getPassword()
				)
		);
	}

	public List<Operator> all() throws DALException {
		List<Operator> list = new ArrayList<>();
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
	
