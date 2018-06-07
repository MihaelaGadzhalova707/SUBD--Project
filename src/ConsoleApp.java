import classes.Cursor;
import classes.JDBC;
import classes.ManageOperations;
import classes.Operation;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.util.Scanner;

public class ConsoleApp{
    private static Operation current = null;
    private static Operation next = null;
    private static Operation previous = null;

    public static void main(String[] args) {
        JDBC connection = new JDBC();
        //connection.createDB();
        Scanner scanner = new Scanner(System.in);
        ResultSet result = null;
        ManageOperations manageOperations = new ManageOperations();
        manageOperations.setOperations(result);
        Cursor cursor = new Cursor();
        boolean enter = false;
        cursor.printCursor(false,true,manageOperations.getOperations().get(0));
        cursor.printCursor(false,false,manageOperations.getOperations().get(1));
        cursor.printCursor(false,false,manageOperations.getOperations().get(2));
        Operation current = manageOperations.getOperations().get(0);
        Operation next = manageOperations.getOperations().get(1);
        Operation previous = manageOperations.getOperations().get(2);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while (line.equalsIgnoreCase("quit") == false) {

            try {
                line = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(line.equals("^[[A")){
                Operation temp = next;
                next = current;
                current = previous;
                previous = temp;

            }
            else if(line.equals("^[[B")){
                Operation temp = current;
                current = next;
                next = previous;
                previous = temp;
            }

            if(line.equals("")){
                enter = true;
            }
            cursor.printCursor(enter, true, current);
            cursor.printCursor(false, false, next);
            cursor.printCursor(false, false, previous);

        }

        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
