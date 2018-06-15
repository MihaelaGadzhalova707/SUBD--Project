package com.subd.project.Repository;

import com.subd.project.Entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CrudRepositoryStudent {

    @Autowired
    JdbcTemplate jdbcTemplate;

    Student findById(long id) {
        return jdbcTemplate.queryForObject("select * from student where id=?", new Object[]{id},
                new StudentMapper());
    }

    List<Student> findAll(){
        String SQL = "select * from student";
        List<Student> students = jdbcTemplate.query(
                SQL, new StudentMapper());
        return students;
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

    private static final class StudentMapper implements RowMapper<Student> {

        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setName(rs.getString("name"));
            student.setClass_letter(rs.getString("class_letter"));
            student.setClass_num(rs.getInt("student_num"));
            student.setGrade(rs.getDouble("grade"));
            return student;
        }
    }
}
