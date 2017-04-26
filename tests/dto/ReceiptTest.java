package dto;

import Test.BaseTest;
import dao.SQL.SQLReceipt;
import dao.contracts.ReceiptDAO;
import org.assertj.core.api.Assertions;
import org.assertj.db.type.Table;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.Assertions.assertThat;

public class ReceiptTest extends BaseTest {
	private ReceiptDAO Receipt;


	@Before
	public void setUp() throws Exception {
		Receipt = new SQLReceipt();

	}

	@After
	public void tearDown() throws Exception {
		Receipt = null;

	}

	@Test
	public void FindAnReceipt() throws Exception{
		assertThat(Receipt.find(3)).hasId(3);
	}

	@Test
	public void CreateAnReceipt() throws Exception {
		Receipt ReceiptDTO = new Receipt(10, "test");
		Receipt.create(ReceiptDTO);

		assertThat(Receipt.find(10))
				.hasName("test")
				.hasId(10);
	}

	@Test
	public void UpdateAnReceipt() throws Exception {
		Receipt ReceiptDTO = Receipt.find(3);

		ReceiptDTO.setName("new name");
		Receipt.update(ReceiptDTO);

		assertThat(Receipt.find(3))
				.hasName("new name");
	}

	@Test
	public void getAllReceipts() throws Exception {
		List<Receipt> Receipts = Receipt.all();
		Assertions.assertThat(Receipts.size()).isEqualTo(3);
	}
}
