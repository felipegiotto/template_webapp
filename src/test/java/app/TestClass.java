package app;

import org.junit.Test;

import com.felipegiotto.utils.datasources.FGConnectionFactory;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestClass extends AbstractTest {

	@Test
	public void testDatabase() throws SQLException {
		try (Connection connection = FGConnectionFactory.getDefaultDataSource().getConnection()) {
			try (ResultSet rs = connection.createStatement().executeQuery("SELECT 1")) {
				while (rs.next()) {
					assertTrue(true);
				}
			}
		}
	}
}
