package dto;

import Test.BaseTest;
import dao.SQL.SQLProductBatch;
import dao.SQL.SQLProductBatchComponent;
import dao.contracts.ProductBatchComponentDAO;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.Assertions.assertThat;

public class ProductBatchComponentTest extends BaseTest {
	private ProductBatchComponentDAO productBatchComponent;


	@Before
	public void setUp() throws Exception {
		productBatchComponent = new SQLProductBatchComponent();

	}

	@After
	public void tearDown() throws Exception {
		productBatchComponent = null;

	}

	@Test
	public void find() throws Exception{
		assertThat(productBatchComponent.find(1,1))
			.hasNetto(10.05)
			.hasTara(0.5)
			.hasOperatorId(1)
			.hasProductBatchId(1)
			.hasMaterialBatchId(1);
	}

	@Test
	public void create() throws Exception {
		ProductBatchComponent productBatchComponent = new ProductBatchComponent(1,7,20, 20, 3);
		this.productBatchComponent.create(productBatchComponent);

		assertThat(this.productBatchComponent.find(1,7))
				.hasTara(20)
				.hasNetto(20)
				.hasOperatorId(3);
	}

	@Test
	public void update() throws Exception {
		ProductBatchComponent productBatchComponent = this.productBatchComponent.find(1,1);

		productBatchComponent.setNetto(3000);
		this.productBatchComponent.update(productBatchComponent);

		assertThat(this.productBatchComponent.find(1,1))
				.hasNetto(3000);
	}

	@Test
	public void getAll() throws Exception {
		List<ProductBatchComponent> productBatchComponents = productBatchComponent.all();
		Assertions.assertThat(productBatchComponents.size()).isEqualTo(14);
	}
}
