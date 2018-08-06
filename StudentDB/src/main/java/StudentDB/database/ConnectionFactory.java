package StudentDB.database;

import StudentDB.config.DatabaseConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    protected static final Logger LOG = LoggerFactory.getLogger(ConnectionFactory.class);

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DatabaseConfig.URL, DatabaseConfig.USER, DatabaseConfig.PASSWORD);
        } catch (SQLException ex) {
            LOG.error("nie udało połączyć się z bazą danych");
            throw new RuntimeException("Błąd podczas łączenia z bazą danych", ex);
        }
    }


}
