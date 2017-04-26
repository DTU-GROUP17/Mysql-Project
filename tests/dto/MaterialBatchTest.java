package dto;

import dao.SQL.SQLMaterialBatch;
import dao.contracts.MaterialBatchDAO;
import org.assertj.core.api.Assertions;
import org.assertj.db.type.Table;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Test.BaseTest;

import java.util.List;

import static org.assertj.Assertions.assertThat;

public class MaterialBatchTest extends BaseTest {
	private MaterialBatchDAO MaterialBatchDAO;


	@Before
	public void setUp() throws Exception {
		MaterialBatchDAO = new SQLMaterialBatch();

	}

	@After
	public void tearDown() throws Exception {
		MaterialBatchDAO = null;

	}

	@Test
	public void FindAnMaterialBatch() throws Exception{
		assertThat(MaterialBatchDAO.find(3)).hasId(3);
	}

	@Test
	public void CreateAnMaterialBatch() throws Exception {
		MaterialBatch MaterialBatch = new MaterialBatch(20, 1, 100);
		MaterialBatchDAO.create(MaterialBatch);

		assertThat(MaterialBatchDAO.find(20))
				.hasAmount(100)
				.hasMaterialId(1);
	}

	@Test
	public void UpdateAnMaterialBatch() throws Exception {
		MaterialBatch MaterialBatch = MaterialBatchDAO.find(3);

		MaterialBatch.setAmount(1000);
		MaterialBatchDAO.update(MaterialBatch);

		assertThat(MaterialBatchDAO.find(3))
				.hasAmount(1000);
	}

	@Test
	public void getAllMaterialBatches() throws Exception {
		List<MaterialBatch> MaterialBatches = MaterialBatchDAO.all();
		Assertions.assertThat(MaterialBatches.size()).isEqualTo(7);
	}
}
