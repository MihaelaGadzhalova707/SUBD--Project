package classes;

public class ExceptionClass  extends  Exception{
    private String name;
    public ExceptionClass(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
