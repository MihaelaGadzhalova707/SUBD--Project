package com.subd.project.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SpringJdbcConfig {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/";

    static final String USER = "root";
    static final String PASS = "1234";

    public Connection connection(){
        Connection conn = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

        return conn;
    }

}