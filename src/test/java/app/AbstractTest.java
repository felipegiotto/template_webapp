package app;

import java.io.File;
import javax.naming.NamingException;
import org.junit.BeforeClass;
import com.felipegiotto.utils.datasources.FGConnectionFactory;
import app.db.ConnectionInitServlet;

public class AbstractTest {

	@BeforeClass
	public static void prepareDatabase() throws NamingException {
		File db = new File("db/development.sqlte3");
		FGConnectionFactory.addManualDataSource(ConnectionInitServlet.JDBC_NAME, "org.sqlite.JDBC", "jdbc:sqlite:" + db.getAbsolutePath());
	}
}
