package dao.contracts;

import java.util.List;

import connectors.DALException;
import dto.Operator;

public interface OperatorDAO {
	Operator find(int oprId) throws DALException;

	List<Operator> all() throws DALException;

	void create(Operator opr) throws DALException;

	void update(Operator opr) throws DALException;
}
