package com.project.fake_account_detection.service;
import java.sql.Connection;
import java.sql.DriverManager;

public class databaseconnection {

    public static Connection getConnection() {

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/fake_account_detection",
                "postgres",
                "postgresql123"
            );

            System.out.println("Database Connected");
            return con;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}