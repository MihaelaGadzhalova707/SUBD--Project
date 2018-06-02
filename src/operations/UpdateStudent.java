package operations;

import classes.Operation;

import java.sql.ResultSet;

public class UpdateStudent extends Operation {

    public UpdateStudent(ResultSet rows) {
        super(rows,"Update");
    }

    public void execute(){
        //to be done
    }
}
