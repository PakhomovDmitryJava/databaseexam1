package com.pakhomov.database;

import java.sql.*;


public class Main {
    public static void main(String[] args) {
        DBWorker worker = new DBWorker();

        String query = "select * from users";
        try {
            Statement statement1 = worker.getConnection().createStatement();
            ResultSet resultSet = statement1.executeQuery(query);
            while (resultSet.next()) {
               // int id = resultSet.getInt(1);
               // System.out.println(id);

                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));

                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}