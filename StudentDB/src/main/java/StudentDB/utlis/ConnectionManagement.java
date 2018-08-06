package StudentDB.utlis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManagement {
    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    public void closeConnections(Connection connection, Statement statement) {
        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException ex) {
            LOG.error("nie udało się zamknąć połączeń do bazy danych" + ex);
        }
    }


}
