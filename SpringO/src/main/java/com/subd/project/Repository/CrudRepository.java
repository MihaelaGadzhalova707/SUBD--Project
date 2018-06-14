package com.subd.project.Repository;

import org.springframework.beans.factory.annotation.Autowired;
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
        return jdbcTemplate.update("insert into student (id, name, passport_number) " + "values(?,  ?, ?)",
                new Object[] { student.getId(), student.getName(), student.getPassportNumber() });
    }

    public int update(Student student) {
        return jdbcTemplate.update("update student " + " set name = ?, passport_number = ? " + " where id = ?",
                new Object[] { student.getName(), student.getPassportNumber(), student.getId() });
    }
}
