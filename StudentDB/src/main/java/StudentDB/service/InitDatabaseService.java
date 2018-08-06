package StudentDB.service;

import StudentDB.database.ConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class InitDatabaseService {
    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    public InitDatabaseService() {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE STUDENT (ID INT, NAME VARCHAR(50), LASTNAME VARCHAR(100), INDEXNUMBER INT, YEAROFSTUDY INT, FIELDOFSTUDY VARCHAR (100) ");
        } catch (SQLException ex) {
            LOG.error("nie udalo sie zainicjować bazy danych" + ex);
        } finally {
            closeConnections(connection, statement);
        }
    }

    private void closeConnections(Connection connection, Statement statement) {
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
