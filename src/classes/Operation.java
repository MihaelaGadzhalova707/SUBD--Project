package classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class Operation {
    private String name;
    protected ResultSet set;
    protected Connection connection;
    protected Statement stmt;
    JDBC jdbc;

    public Operation(ResultSet set, String name){
        this.set = set;
        this.name = name;

        jdbc = new JDBC();
        connection = jdbc.connection();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void execute();
}
