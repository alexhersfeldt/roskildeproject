package com.firstproject.roskildedayproject.Repository;

import com.firstproject.roskildedayproject.Model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherRepository implements ITeacherRepo{
    @Autowired
    JdbcTemplate template;

    @Override
    public List<Teacher> fetchAll() {
        String sql = "SELECT * FROM teacher";
        RowMapper<Teacher> rowMapper = new BeanPropertyRowMapper<>(Teacher.class);
        return template.query(sql, rowMapper);
    }

    @Override
    public Teacher findTeacherByTid(int TID) {
        String sql = "SELECT * FROM teacher WHERE TID=?";
        RowMapper<Teacher> rowMapper = new BeanPropertyRowMapper<>(Teacher.class);
        Teacher teach= template.queryForObject(sql, rowMapper, TID);
        return teach;
    }
}
