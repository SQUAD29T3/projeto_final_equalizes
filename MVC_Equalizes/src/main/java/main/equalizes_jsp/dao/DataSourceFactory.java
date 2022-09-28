package main.equalizes_jsp.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.mariadb.jdbc.MariaDbDataSource;

public class DataSourceFactory {
	private final DataSource daso;
	private static final Logger LOGGER = Logger.getLogger(DataSourceFactory.class.getName());

	DataSourceFactory() {
		final MariaDbDataSource daso = new MariaDbDataSource();
		final String rootpath = Object
				.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("database.properties"))
				.getPath();

		InputStream input = null;

		try {
			input = new FileInputStream(rootpath);
			final Properties props = new Properties();
			props.load(input);
			daso.setDatabaseName(props.getProperty("database"));
			daso.setServerName(props.getProperty("serverName"));
			daso.setPort(Integer.parseInt(props.getProperty("port")));
			daso.setUser(props.getProperty("user"));
			daso.setPassword(props.getProperty("password"));
		} catch (final FileNotFoundException e) {
			LOGGER.log(Level.SEVERE, "file database properties not found", e);
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (final IOException e) {
					LOGGER.log(Level.SEVERE, "failed to close stream", e);
				}
			}
		}
		this.daso = daso;
	}

	public static Connection getConnection() throws SQLException {
		return SingletonHelper.INSTANCE.daso.getConnection();
	}

	private static class SingletonHelper {
		private static final DataSourceFactory INSTANCE = new DataSourceFactory();
	}
}
