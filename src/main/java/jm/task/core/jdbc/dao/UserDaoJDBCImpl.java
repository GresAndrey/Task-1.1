package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import org.hibernate.engine.jdbc.connections.internal.DriverConnectionCreator;
import org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionCreator;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

    private  final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String login = "postgres";
    private final String password = "gresandrey26rus";
    Connection conn = DriverManager.
            getConnection(url, login, password);

    public UserDaoJDBCImpl() throws SQLException {
        Statement st = conn.createStatement();
        st.executeUpdate("CREATE TABLE IF NOT EXISTS users (id BIGINT PRIMARY KEY, name VARCHAR(255), last_name VARCHAR(255), age INT)");

    }

    public void createUsersTable() {

    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
