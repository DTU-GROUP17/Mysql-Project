package dto;


import connectors.Connector;
import dao.SQL.SQLOperator;
import dao.contracts.OperatorDAO;
import org.assertj.db.type.Source;
import org.assertj.db.type.Table;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.db.api.Assertions.assertThat;
import static org.assertj.Assertions.assertThat;

public class OperatorTest {
	OperatorDAO operatorDAO;


	@Before
	public void setUp() throws Exception {
		new Connector();
		operatorDAO = new SQLOperator();

	}

	@After
	public void tearDown() throws Exception {
		operatorDAO = null;

	}

	@Test
	public void FindAnOperator() throws Exception{
		assertThat(operatorDAO.find(3)).hasId(3);
		//assertThat(operatorDAO.find(3).equals(3));

	}

	@Test
	public void CreateAnOperator() throws Exception {
		Table table = new Table(new Source("jdbc:mysql://localhost:3306/sql_project?serverTimezone=UTC", "root", ""), "operator");
		assertThat(table).column("name").value().isEqualTo("Luigi C");
	}
}