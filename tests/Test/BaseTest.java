package Test;

import connectors.Connector;
import org.assertj.db.type.Source;
import org.flywaydb.core.Flyway;
import org.junit.Before;

public abstract  class BaseTest {

	public Source source;

	@Before
	public void setUpBaseTest() throws Exception {
		source = new Source("jdbc:mysql://localhost:3306/sql_project?serverTimezone=UTC&nullNamePatternMatchesAll=true", "root", "");


		// Clean and migrate database.
		Flyway flyway = new Flyway();
		flyway.setDataSource("jdbc:mysql://localhost:3306/sql_project?serverTimezone=UTC&nullNamePatternMatchesAll=true", "root", "");
		flyway.setLocations("filesystem:src/database/migrations");
		flyway.clean();
		flyway.migrate();

		// Migrate the test data.
		flyway.setLocations("filesystem:tests/seeds");
		flyway.setValidateOnMigrate(false);
		flyway.migrate();

		new Connector();
	}
}
