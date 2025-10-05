package com.jdbc;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class a1_Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "Mysql@12";
        String query = "select * from employees";

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
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                Double salary = rs.getDouble("salary");
                System.out.println(id + " | " + name + " | " + job_title + " | " + salary);

            }
            rs.close();
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
