package com.subd.project.Repository;

import com.subd.project.Entities.Student;
import com.subd.project.Entities.Subject;

import java.util.List;

public class CrudRepositorySubject {


    List<Student> findAll(){
        String SQL = "select * from Subjects";
        List<Subject> subjects = jdbcTemplate.query(
                SQL, new CrudRepositoryStudent.SubjectMapper());
        return subjects;
    }

}
