package classes;

import java.util.Date;

public class Student {
    private String name;
    private int num;
    private int classNum;
    private char classLetter;
    private Date birthday;
    private long entanceExamResult;

    public Student(String name, int num, int classNum, char classLetter, Date birthday, long examResult){
        this.name = name;
        this.num = num;
        this.classNum = classNum;
        this.classLetter = classLetter;
        this.birthday = birthday;
        entanceExamResult = examResult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public char getClassLetter() {
        return classLetter;
    }

    public void setClassLetter(char classLetter) {
        this.classLetter = classLetter;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        birthday = birthday;
    }

    public long getEntanceExamResult() {
        return entanceExamResult;
    }

    public void setEntanceExamResult(long entanceExamResult) {
        this.entanceExamResult = entanceExamResult;
    }

    public void printStudent(){
        //TO DO
    }
}
