package com.subd.project.Repository;


import com.subd.project.Entities.Student;
import com.subd.project.Entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class CrudRepositorySubject {

    @Autowired
    JdbcTemplate jdbcTemplate;

    Subject findById(long id) {
        return jdbcTemplate.queryForObject("select * from subject where id=?", new Object[]{id},
                new SubjectMapper());
    }

    private static final class SubjectMapper implements RowMapper<Subject> {

        public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
            Subject subject = new Subject();
            subject.setName(rs.getString("name"));
            return subject;
        }
    }

}
