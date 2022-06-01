package com.pakhomov.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {
    private static final String URL = "jdbc:mysql://localhost:3306/my_new_schema?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123123";
    private Connection connection;

   public DBWorker() {
       try {
           connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }

    public Connection getConnection() {
        return connection;
    }
}
