package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String url ="jdbc:postgresql://localhost:5432/postgres";
    private static final String login ="postgres";
    private static final String password = "gresandrey26rus";

    private static Connection conn = null;
    public static Connection connection() throws SQLException {
        conn = DriverManager.getConnection(url,login, password);
        return conn;
    }

    /////////////////////////////////////////////////////////////////////////////////

    public static SessionFactory sessionFactory() {
        Configuration configuration = new Configuration().addAnnotatedClass(User.class);
        return configuration.buildSessionFactory();
    }


}
