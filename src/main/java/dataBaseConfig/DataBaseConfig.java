package dataBaseConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

public class DataBaseConfig {
    private static final Dotenv dotenv = Dotenv.load();
   
    private static final String DB_URL = dotenv.get("DB_URL");
    private static final String DB_USER = dotenv.get("DB_USER");
    private static final String DB_PASSWORD = dotenv.get("DB_PASSWORD");

  
    private static final String ADMIN_USER = "admin"; 
    private static final String ADMIN_PASSWORD = "admin_password"; 
    private static final String SALES_USER = "sales"; 
    private static final String SALES_PASSWORD = "sales_password"; 

   
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public static String getDB_URL() {
        return DB_URL;
    }

    public static String getDB_USER() {
        return DB_USER;
    }

    public static String getDB_PASSWORD() {
        return DB_PASSWORD;
    }

    // Getter methods for user credentials
    public static String getAdminUser() {
        return ADMIN_USER;
    }

    public static String getAdminPassword() {
        return ADMIN_PASSWORD;
    }

    public static String getSalesUser() {
        return SALES_USER;
    }

    public static String getSalesPassword() {
        return SALES_PASSWORD;
    }
}