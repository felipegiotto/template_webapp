package app.db;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.flywaydb.core.Flyway;

/**
 * Classe que atualiza o banco de dados para a última versão.
 * 
 * @author felipegiotto@gmail.com
 */
public class FlywayMigrationTask {

	private static final Logger LOGGER = LogManager.getLogger(FlywayMigrationTask.class);
	
	public static void main(String[] args) {
		
        // Create the Flyway instance
        Flyway flyway = new Flyway();

        // Point it to the database
        flyway.setDataSource("jdbc:h2:file:./target/foobar", "sa", null);

        // Start the migration
        flyway.migrate();
    }
}
