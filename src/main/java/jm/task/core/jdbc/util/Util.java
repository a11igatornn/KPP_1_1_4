package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static String URL = "jdbc:mysql://localhost:3306/mydb";
    private static String userName = "root";
    private static String password = "p523xk52RUS";

    public static Connection getMySQLConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, userName, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}

