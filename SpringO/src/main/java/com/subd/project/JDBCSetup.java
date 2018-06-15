package com.subd.project;

import com.subd.project.Config.SpringJdbcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;

public class JDBCSetup {
    private SpringJdbcConfig springJdbcConfig;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void init(Connection connection){

        String db = "DROP DATABASE IF EXISTS diary;\n" +
                "CREATE DATABASE diary CHARSET 'utf8';\n" +
                "USE diary;\n" +

                "\n" +

                "CREATE TABLE student(\n" +
                "\tId INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
                "\tname VARCHAR(150) NOT NULL,\n" +
                "\tclass_num INTEGER NOT NULL,\n" +
                "\tclass_letter CHAR(1) NOT NULL,\n" +
                "\tstudent_num INTEGER NOT NULL,\n" +
                "\tgrade NUMERIC(3,2)\n" + ")\n"+

                "\n" +

                "CREATE TABLE Subjects(\n" +
                "\tId INTEGER NOT NULL AUTO_INCREMENT,\n" +
                "\tName VARCHAR(100),\n" +
                "\t\n" +
                "\tPRIMARY KEY(Id)\n" +
                ");\n" +

                "\n" +

                "CREATE TABLE StudentMarks(\n" +
                "\tStudentId INTEGER NOT NULL,\n" +
                "\tSubjectId INTEGER NOT NULL,\n" +
                "\tExamDate DATETIME NOT NULL,\n" +
                "\tMark NUMERIC(3,2) NOT NULL,\n" +
                "\t\n" +
                "\tPRIMARY KEY( StudentId, SubjectId, ExamDate ),\n" +
                "\tFOREIGN KEY (StudentId) REFERENCES Students(Id),\n" +
                "\tFOREIGN KEY (SubjectId) REFERENCES Subjects(Id)\n" +
                ");\n";

        jdbcTemplate.execute(db);
    }




}
