package com.jdbc;

import java.sql.*;

public class a2_Insert_data_into_database {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "Mysql@12";
        String query = "insert into employees (id, name, job_title, salary) values (3, 'John Doe', 'Software Engineer', 75000.00);";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load driver: "+e.getMessage());
        }

        try{
            Connection con =  DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully");
            Statement stmt = con.createStatement();
            int rowAffected = stmt.executeUpdate(query);
            if(rowAffected > 0){
                System.out.println("insert successfully "+ rowAffected +" rows affected");
            }
            else {
                System.out.println("insertion failed");
            }

            stmt.close();
            con.close();
            System.out.println("Connection closed successfully");

        }
        catch (SQLException e)
        {
            System.out.println("Connection failed: "+e.getMessage());
        }


    }
}
