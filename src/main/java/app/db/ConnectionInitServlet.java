package app.db;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.annotation.WebServlet;

import com.felipegiotto.utils.datasources.FGDatabaseInitServlet;

@WebServlet(loadOnStartup = 1, urlPatterns={})
public class ConnectionInitServlet extends FGDatabaseInitServlet {

	public static final String JDBC_NAME = "jdbc/template_webapp";
	private static final long serialVersionUID = 1L;
	
	public ConnectionInitServlet() throws NamingException, SQLException {
		super(true, JDBC_NAME);
	}
}
