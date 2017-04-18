package dto;


import connectors.Connector;
import dao.SQL.SQLOperator;
import dao.contracts.OperatorDAO;
import javafx.scene.control.Tab;
import org.assertj.db.type.Source;
import org.assertj.db.type.Table;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Test.BaseTest;



import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.db.api.Assertions.assertThat;
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
		assertThat(table)
			.row(1)
				.column("name")
					.value().isEqualTo("Angelo A");
	}

}