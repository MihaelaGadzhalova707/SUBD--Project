package classes;
import java.sql.*;

public class JDBC {

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

    public void createDB() {

        Connection conn = connection();
        Statement stmt = null;

        try {

            System.out.println("Creating database...");
            stmt = conn.createStatement();

            String sql = "DROP DATABASE IF EXISTS school;\n" +
                    "CREATE DATABASE school CHARSET 'utf8';\n" +
                    "USE school;\n" +
                    "\n" +
                    "CREATE TABLE Students(\n" +
                    "\tId INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
                    "\tName VARCHAR(150) NOT NULL,\n" +
                    "\tNum INTEGER NOT NULL,\n" +
                    "\tClassNum INTEGER NOT NULL,\n" +
                    "\tClassLetter CHAR(1) NOT NULL,\n" +
                    "\tBirthday DATE,\n" +
                    "\tEntranceExamResult NUMERIC(3,2)\n" +
                    ")";

            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
                //sth
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");

    }


}
