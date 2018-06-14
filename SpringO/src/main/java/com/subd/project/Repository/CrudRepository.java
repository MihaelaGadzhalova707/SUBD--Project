package com.subd.project.Repository;

import com.subd.project.Entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CrudRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    Student findById(long id) {
        return jdbcTemplate.queryForObject("select * from student where id=?", new Object[]{id},
                new BeanPropertyRowMapper<Student>(Student.class));
    }

    public int deleteById(long id) {
        return jdbcTemplate.update("delete from student where id=?", new Object[] { id });
    }

    public int insert(Student student) {
        return jdbcTemplate.update("insert into student (id, name, class_num, class_letter, student_num, grade) " + "values(?, ?, ?, ?, ?, ?)",
                new Object[] { student.getId(), student.getName(), student.getClass_num(), student.getClass_letter(), student.getStudent_num(), student.getGrade() });
    }

    public int update(Student student) {
        return jdbcTemplate.update("update student " + " set name = ?,  class_num = ?, class_letter = ?, student_num = ?, grade = ?" + " where id = ?",
                new Object[] { student.getName(), student.getStudent_num(), student.getClass_letter(), student.getStudent_num(), student.getGrade(), student.getId() });
    }
}
