package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserServiceImpl service = new UserServiceImpl();
//        service.createUsersTable();
//
        service.saveUser("Leonid", "Petrov", (byte) 15);
        service.saveUser("Andrey", "Petrov", (byte) 5);
        service.saveUser("Oleg", "Petrov", (byte) 46);
        service.saveUser("Anton", "Petrov", (byte) 37);

        service.getAllUsers();
//
////        service.removeUserById(3);
//

//        SessionFactory sessionFactory = Util.sessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        try {
//            session.beginTransaction();
////
////            User user = session.find(User.class, 2L);
//            User user1 = new User("Leonid", "Petrov", (byte) 15);
//            User user2 = new User("Andrey", "Petrov", (byte) 5);
//            User user3 = new User("Anton", "Petrov", (byte) 37);
//
//            session.save(user1);
//            session.save(user2);
//            session.save(user3);
////            User user = session.get(User.class, 2L);
////            System.out.println(user.getName());
////            System.out.println(user.getLastName());
//
//            session.getTransaction().commit();
//        } finally {
//            sessionFactory.close();
//        }


//        service.dropUsersTable();

    }
}
