package dto;

import dao.SQL.SQLProductBatch;
import dao.SQL.SQLRole;
import dao.contracts.RoleDAO;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import Test.BaseTest;

import static org.assertj.Assertions.assertThat;

public class RoleTest extends BaseTest{
	private RoleDAO role;


	@Before
	public void setUp() throws Exception {
		role = new SQLRole();

	}

	@After
	public void tearDown() throws Exception {
		role = null;

	}

	@Test
	public void find() throws Exception{
		assertThat(role.find(1)).hasName("admin").hasId(1);
	}

	@Test
	public void create() throws Exception {
		Role role = new Role(3 , "SuperAdmin");
		this.role.create(role);

		assertThat(this.role.find(3))
				.hasName("SuperAdmin");
	}

	@Test
	public void update() throws Exception {
		Role role = this.role.find(1);

		role.setName("Pimp");
		this.role.update(role);

		assertThat(this.role.find(1))
				.hasName("Pimp");
	}

	@Test
	public void getAll() throws Exception {
		List<Role> roles = role.all();
		Assertions.assertThat(roles.size()).isEqualTo(2);
	}
}
