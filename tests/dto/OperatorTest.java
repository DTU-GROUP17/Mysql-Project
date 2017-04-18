package dto;


import Test.BaseTest;
import connectors.Connector;
import dao.SQL.SQLOperator;
import dao.contracts.OperatorDAO;
import org.assertj.db.type.Table;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.Assertions.assertThat;

public class OperatorTest extends BaseTest {
	OperatorDAO operator;
	Table table;


	@Before
	public void setUp() throws Exception {
		new Connector();
		operator = new SQLOperator();
		table = new Table(source, "operator");

	}

	@After
	public void tearDown() throws Exception {
		operator = null;

	}

	@Test
	public void FindAnOperator() throws Exception{
		assertThat(operator.find(3)).hasId(3);
	}

	@Test
	public void CreateAnOperator() throws Exception {
		Operator operatorDTO = new Operator(10, "test", "ABC", "1234", "1234");
		operator.create(operatorDTO);

		assertThat(operator.find(10))
			.hasName("test")
			.hasIni("ABC")
			.hasCpr("1234")
			.hasPassword("1234")
			.hasId(10);
	}

	@Test
	public void UpdateAnOperator() throws Exception {
		Operator operatorDTO = operator.find(3);

		operatorDTO.setName("new name");
		operator.update(operatorDTO);

		assertThat(operator.find(3))
			.hasName("new name");
	}

}