package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String url ="jdbc:postgresql://localhost:5432/postgres";
    private static final String login ="postgres";
    private static final String password = "gresandrey26rus";
    public static Connection connection() throws SQLException {
        Connection conn = DriverManager.getConnection(url,login, password);
        return null;
    }
}
