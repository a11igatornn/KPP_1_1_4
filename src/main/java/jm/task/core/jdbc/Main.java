package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Util.getMySQLConnection();
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Jim", "Kerry", (byte)22);
        userService.saveUser("Jim", "Kerry", (byte)22);
        userService.saveUser("Jim", "Kerry", (byte)22);
        userService.saveUser("Jim", "Kerry", (byte)22);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
