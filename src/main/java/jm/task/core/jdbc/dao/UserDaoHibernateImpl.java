package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    SessionFactory sessionFactory = Util.sessionFactory();

    public UserDaoHibernateImpl() {

    }


    @Override
    public void createUsersTable() {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();

        session.createSQLQuery("CREATE TABLE IF NOT EXISTS users (id SERIAL PRIMARY KEY, name VARCHAR(255), lastName VARCHAR(255), age INT)")
                .addEntity(User.class)
                .executeUpdate();

        session.getTransaction().commit();
        System.out.println("Таблица создана");
        } finally {
            session.close();
        }
    }

    @Override
    public void dropUsersTable() {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();

            session.createSQLQuery("DROP TABLE IF EXISTS users")
                    .addEntity(User.class)
                    .executeUpdate();

            session.getTransaction().commit();
            System.out.println("Таблица удалена");
        } finally {
            session.close();
        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            User user = new User(name, lastName, age);
            session.save(user);

            session.getTransaction().commit();
            System.out.println("Добавлен пользователь:" + name + ", " + lastName + ", " + age);
        } finally {
            session.close();
        }
    }

    @Override
    public void removeUserById(long id) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();

            User user = session.find(User.class, id);
            session.remove(user);

            session.getTransaction().commit();
            System.out.println("Пользователь с номером id = " + id + " был удален");
        } finally {
            session.close();
        }
    }

    @Override
    public List<User> getAllUsers() {

        List<User> users = new ArrayList<>();

        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();

            users = session.createQuery("From " + User.class.getSimpleName()).list();

            session.getTransaction().commit();
            for (Iterator<User> it = users.iterator(); it.hasNext();) {
                User user = (User) it.next();
                System.out.println(user.toString());
            }
            } finally{
            session.close();
            }
        return users;
    }

    @Override
    public void cleanUsersTable() {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();

            session.createSQLQuery("DELETE FROM users")
                    .addEntity(User.class)
                    .executeUpdate();

            session.getTransaction().commit();
            System.out.println("Все пользователи удалены");
        } finally {
            session.close();
        }
    }
}
