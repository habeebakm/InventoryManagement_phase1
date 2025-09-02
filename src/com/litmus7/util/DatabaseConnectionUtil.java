package com.litmus7.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnectionUtil {

    private static final Logger logger = Logger.getLogger(DatabaseConnectionUtil.class.getName());

    private static final String URL = "jdbc:mysql://localhost:3306/inventoryfeed";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "abc";

    public static Connection getConnection() throws SQLException {
        try {
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            logger.info("Database connection established successfully.");
            return conn;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Database connection failed", e);
            throw e;
        }
    }
}
