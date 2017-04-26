package dto;

import Test.BaseTest;
import dao.SQL.SQLMaterial;
import dao.contracts.MaterialDAO;
import org.assertj.core.api.Assertions;
import org.assertj.db.type.Table;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.Assertions.assertThat;

public class MaterialTest extends BaseTest{

	private MaterialDAO materialDAO;


	@Before
	public void setUp() throws Exception {
		materialDAO = new SQLMaterial();

	}

	@After
	public void tearDown() throws Exception {
		materialDAO = null;

	}

	@Test
	public void FindAnMaterial() throws Exception{
		assertThat(materialDAO.find(3)).hasId(3);
	}

	@Test
	public void CreateAnMaterial() throws Exception {
		Material material = new Material(10, "Fløde", "DK-Hostmaster");
		materialDAO.create(material);

		assertThat(materialDAO.find(10))
				.hasName("Fløde")
				.hasSupplier("DK-Hostmaster");
	}

	@Test
	public void UpdateAnMaterial() throws Exception {
		Material material = materialDAO.find(3);

		material.setName("new name");
		materialDAO.update(material);

		assertThat(materialDAO.find(3))
				.hasName("new name");
	}

	@Test
	public void getAllMaterials() throws Exception {
		List<Material> materials = materialDAO.all();
		Assertions.assertThat(materials.size()).isEqualTo(7);
	}
}
