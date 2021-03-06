package com.subd.project.Repository;


import com.subd.project.Entities.Student;
import com.subd.project.Entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CrudRepositorySubject {

    @Autowired
    JdbcTemplate jdbcTemplate;

    Subject findById(long id) {
        return jdbcTemplate.queryForObject("select * from Subjects where id=?", new Object[]{id},
                new SubjectMapper());
    }

    List<Subject> findAll() {
        String SQL = "select * from Subjects";
        List<Subject> subjects = jdbcTemplate.query(
                SQL, new SubjectMapper());
        return subjects;
    }

    public int insert(Subject subject) {
        return jdbcTemplate.update("insert into Subjects (id, name) " + "values(?, ?)",
                new Object[] { subject.getId(), subject.getName()});
    }

    public int update(Subject subject) {
        return jdbcTemplate.update("update Subjects " + " set name = ?" + " where id = ?",
                new Object[] { subject.getId(),subject.getName()});
    }

    public int deleteById(long id) {
        return jdbcTemplate.update("delete from Subjects where id=?", new Object[] { id });
    }

    private static final class SubjectMapper implements RowMapper<Subject> {

        public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
            Subject subject = new Subject();
            subject.setName(rs.getString("name"));
            return subject;
        }
    }

}
