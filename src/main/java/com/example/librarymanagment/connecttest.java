package com.example.librarymanagment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connecttest {                              //just checking
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/library_db";
        String user = "postgres";
        String password = "adiq1111";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("connected");
        } catch (SQLException e) {
            System.out.println("failed: " + e.getMessage());
        }
    }
}