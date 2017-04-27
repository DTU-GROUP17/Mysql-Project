package dto;

import Test.BaseTest;
import dao.SQL.SQLProductBatch;
import dao.SQL.SQLReceiptComponent;
import dao.contracts.ProductBatchDAO;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.Assertions.assertThat;

public class ProductBatchTest extends BaseTest {
	private ProductBatchDAO productBatch;


	@Before
	public void setUp() throws Exception {
		productBatch = new SQLProductBatch();

	}

	@After
	public void tearDown() throws Exception {
		productBatch = null;

	}

	@Test
	public void find() throws Exception{
		assertThat(productBatch.find(1)).hasReceiptId(1).hasStatus(2);
	}

	@Test
	public void create() throws Exception {
		ProductBatch productBatch = new ProductBatch(20, 2, 2);
		this.productBatch.create(productBatch);

		assertThat(this.productBatch.find(20))
				.hasStatus(2)
				.hasReceiptId(2);
	}

	@Test
	public void update() throws Exception {
		ProductBatch productBatch = this.productBatch.find(1);

		productBatch.setStatus(20);
		this.productBatch.update(productBatch);

		assertThat(this.productBatch.find(1))
			.hasStatus(20);
	}

	@Test
	public void getAll() throws Exception {
		List<ProductBatch> productBatches = productBatch.all();
		Assertions.assertThat(productBatches.size()).isEqualTo(5);
	}
}
