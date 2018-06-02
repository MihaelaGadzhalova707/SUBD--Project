package operations;

import classes.JDBC;
import classes.Operation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class AddStudent extends Operation {

    public AddStudent(ResultSet rows) {
        super(rows,"Add");
    }

    public void execute(){
        //TO DO
    }
}
