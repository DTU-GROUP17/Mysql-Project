package dto;

import Test.BaseTest;
import dao.SQL.SQLReceiptComponent;
import dao.contracts.ReceiptComponentDAO;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.Assertions.assertThat;

public class ReceiptComponentTest extends BaseTest {
	private ReceiptComponentDAO receiptComponent;


	@Before
	public void setUp() throws Exception {
		receiptComponent = new SQLReceiptComponent();

	}

	@After
	public void tearDown() throws Exception {
		receiptComponent = null;

	}

	@Test
	public void FindAnReceiptComponent() throws Exception{
		assertThat(receiptComponent.findByReceiptAndMaterial(1,1)).hasMaterialId(1).hasReceiptId(1);
	}

	@Test
	public void CreateAnReceiptComponent() throws Exception {
		ReceiptComponent receiptComponent = new ReceiptComponent(3, 3, 1.1, 2.2);
		this.receiptComponent.create(receiptComponent);

		assertThat(this.receiptComponent.findByReceiptAndMaterial(3,3))
				.hasNomNetto(1.1)
				.hasTolerance(2.2);
	}

	@Test
	public void UpdateAnReceiptComponent() throws Exception {
		ReceiptComponent receiptComponent = this.receiptComponent.findByReceiptAndMaterial(1,1);

		receiptComponent.setNomNetto(300.3);
		this.receiptComponent.update(receiptComponent);

		assertThat(this.receiptComponent.findByReceiptAndMaterial(1,1))
				.hasNomNetto(300.3);
	}

	@Test
	public void getAllReceiptComponents() throws Exception {
		List<ReceiptComponent> receiptComponents = receiptComponent.all();
		Assertions.assertThat(receiptComponents.size()).isEqualTo(12);
	}
}
