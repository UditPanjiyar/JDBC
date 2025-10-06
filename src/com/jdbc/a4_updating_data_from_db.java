package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class a4_updating_data_from_db {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "Mysql@12";
        String query = "update employees set salary = 80000.00 where id = 1;";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver: " + e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully");
            Statement stmt = con.createStatement();
            int rowAffected = stmt.executeUpdate(query);
            if (rowAffected > 0) {
                System.out.println("update successfully " + rowAffected + " rows affected");
            } else {
                System.out.println("update failed");
            }

            stmt.close();
            con.close();
            System.out.println("Connection closed successfully");

        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
