package com.subd.project.Models;

import javax.persistence.Entity;
import javax.persistence.Id;


public class StudentModel {

    @Id
    private int id;
    private String name;
    private int class_num;
    private char class_letter;
    private int  student_num;
    private double grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClass_num() {
        return class_num;
    }

    public void setClass_num(int class_num) {
        this.class_num = class_num;
    }

    public char getClass_letter() {
        return class_letter;
    }

    public void setClass_letter(char class_letter) {
        this.class_letter = class_letter;
    }

    public int getStudent_num() {
        return student_num;
    }

    public void setStudent_num(int student_num) {
        this.student_num = student_num;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}