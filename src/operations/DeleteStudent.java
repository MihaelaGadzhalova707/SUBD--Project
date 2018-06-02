package operations;

import classes.Operation;

import java.sql.ResultSet;

public class DeleteStudent extends Operation{

    public DeleteStudent(ResultSet rows) {
        super(rows,"Delete");
    }

    public void execute(){
        //to be done
    }
}
