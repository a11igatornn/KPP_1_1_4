package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoJDBCImpl();
    private UserDao userDaoHibernate = new UserDaoHibernateImpl();
    public void createUsersTable() throws SQLException, ClassNotFoundException {
        //userDao.createUsersTable();
        userDaoHibernate.createUsersTable();

    }

    public void dropUsersTable() throws SQLException, ClassNotFoundException {
        //userDao.dropUsersTable();
        userDaoHibernate.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) throws SQLException, ClassNotFoundException {
        //userDao.saveUser(name, lastName, age);
        userDaoHibernate.saveUser(name, lastName, age);

    }

    public void removeUserById(long id) throws SQLException, ClassNotFoundException {
        //userDao.removeUserById(id);
        userDaoHibernate.removeUserById(id);

    }

    public List<User> getAllUsers() throws SQLException, ClassNotFoundException {
        //return userDao.getAllUsers();
        return userDaoHibernate.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException, ClassNotFoundException {
        //userDao.cleanUsersTable();
        userDaoHibernate.cleanUsersTable();

    }

}
