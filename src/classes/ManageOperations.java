package classes;

import operations.AddStudent;
import operations.DeleteStudent;
import operations.ShowStudents;
import operations.UpdateStudent;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ManageOperations {
    private List<Operation> operations;

    public ManageOperations(){
        operations = new ArrayList<>();
    }

    public void setOperations(ResultSet set){
        operations.add(new AddStudent(set));
        operations.add(new UpdateStudent(set));
        operations.add(new DeleteStudent(set));
        operations.add(new ShowStudents(set));
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public Operation findOperation(String findByName) throws ExceptionClass{
        for(Operation op:operations){
            if(op.getName().equals(findByName))
                return op;
        }
        throw new ExceptionClass("Unknown operation");
    }
}
