package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserServiceImpl service = new UserServiceImpl();
        service.createUsersTable();
    }
}
