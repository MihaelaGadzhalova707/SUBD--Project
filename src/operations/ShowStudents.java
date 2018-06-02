package operations;

import classes.Operation;
import classes.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ShowStudents extends Operation {

    public ShowStudents(ResultSet rows) {
        super(rows,"Show");
    }

    public void execute(){
        String query = "SELECT * FROM Students";

        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String studentName = rs.getString("Name");
                int numInClass = rs.getInt("Num");
                int classNum = rs.getInt("ClassNum");
                String classLetter = rs.getString("classLetter");
                Date birthday = rs.getDate("Birthday");
                long examResult = rs.getLong("EntranceExamResult");
                Student student = new Student(studentName, numInClass, classNum, classLetter.charAt(0), birthday, examResult);
                student.printStudent();
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
