package classes;

public class Cursor {

    private ManageOperations operations;

    public void printCursor(boolean enter,boolean cursorOn,Operation operation) {

        Operation foundOperation;

        if(cursorOn == false){
            System.out.println(operation.getName());
        }
        else {
            System.out.println(" ->" + operation.getName());

            if(enter == true) {
                try {
                    foundOperation = operations.findOperation(operation.getName());
                    foundOperation.execute();
                }
                catch(ExceptionClass e){
                    System.out.println(e.getName());
                }

            }
        }
    }
}
