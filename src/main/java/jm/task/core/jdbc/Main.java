package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserServiceImpl service = new UserServiceImpl();
//        service.createUsersTable();
//
//        service.saveUser("Leonid", "Petrov", (byte) 15);
//        service.saveUser("Andrey", "Petrov", (byte) 5);
//        service.saveUser("Oleg", "Petrov", (byte) 46);
//        service.saveUser("Anton", "Petrov", (byte) 37);

//        service.removeUserById(3);

        System.out.println(service.getAllUsers());
        service.cleanUsersTable();

//        service.dropUsersTable();

    }
}
