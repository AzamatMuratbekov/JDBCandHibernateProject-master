package com.peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static String USERNAME = "postgres";
    private static String PASSWORD = "postgres";

    public static Connection connection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение установлено:");
        }catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println("Запрос выполнен!");
        System.out.println("-----------------------------------------");
        return conn;
    }
}
