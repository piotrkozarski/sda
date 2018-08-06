package StudentDB.service;

import StudentDB.Student;
import StudentDB.database.ConnectionFactory;
import StudentDB.utlis.ConnectionManagement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class StudentService {
    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    public void saveStudent(Student student) {

        Connection connection = ConnectionFactory.getConnection();
        ConnectionManagement management = new ConnectionManagement();

        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("INSERT INTO STUDENT VALUES (?, ?, ?, ? ?");
            statement.setString(1, student.getFirstName());
            statement.setString(2, student.getLastName());
            statement.setInt(3, student.getIndexNumber());
            statement.setInt(4, student.getYearOfStudy());
            statement.setString(5, student.getFieldOfStudy());

            statement.execute();

            LOG.info("student dodany " + student.getLastName() + " " + student.getFirstName() + " do bazy");
        } catch (SQLException ex) {
            LOG.error("nie udało się zapisać studenta " + student.getLastName() + " " + student.getFirstName() + " do bazy ");
        } finally {
            management.closeConnections(connection, statement);
        }
    }

    public Set<String> getAll() {
        Set<String> studentNames = new HashSet<>();
        Connection connection = ConnectionFactory.getConnection();
        ConnectionManagement management = new ConnectionManagement();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENT");

            while (resultSet.next()) {
                studentNames.add(resultSet.getString("name"));
            }
        } catch (SQLException ex) {
            LOG.error("nie udało się pobrać studentów z bazy" + ex);
        } finally {
            management.closeConnections(connection, statement);
        }
        return studentNames;
    }
}


//"CREATE TABLE STUDENT (ID , NAME , LASTNAME , INDEXNUMBER , YEAROFSTUDY , FIELDOFSTUDY ");