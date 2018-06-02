import classes.JDBC;

import java.sql.ResultSet;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        JDBC connection = new JDBC();
        connection.createDB();
        Scanner scanner = new Scanner(System.in);
        ResultSet result = null;

        while(true){
            //cursor logic (TO DO)
        }

    }

}
