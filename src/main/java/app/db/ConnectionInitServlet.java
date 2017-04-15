package app.db;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.felipegiotto.utils.datasources.FGConnectionFactory;

@WebServlet(loadOnStartup = 1, urlPatterns={})
public class ConnectionInitServlet extends HttpServlet {

	public static final String JDBC_NAME = "jdbc/template_webapp";
	
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LogManager.getLogger(ConnectionInitServlet.class);
	
	@Override
	public void init() throws ServletException {
		try {
			FGConnectionFactory.loadFromWebContext(JDBC_NAME);
		} catch (NamingException e) {
			LOGGER.error("Erro iniciando datasources: " + e.getLocalizedMessage(), e);
		}
	}
	
	@Override
	public void destroy() {
		FGConnectionFactory.close();
	}
}
