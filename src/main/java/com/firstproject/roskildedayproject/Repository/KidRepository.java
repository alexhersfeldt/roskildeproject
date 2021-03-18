package com.firstproject.roskildedayproject.Repository;

import com.firstproject.roskildedayproject.Model.Kid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KidRepository implements IKidRepo{
    @Autowired
    JdbcTemplate template;

    @Override
    public List<Kid> fetchALL() {
        String sql = "SELECT * FROM kid";
        RowMapper<Kid> rowMapper = new BeanPropertyRowMapper<>(Kid.class);
        return template.query(sql, rowMapper);
    }

    @Override
    public Kid findKidByKid(int KKID) {
        String sql = "SELECT * FROM kid WHERE KKID=?";
        RowMapper<Kid> rowMapper = new BeanPropertyRowMapper<>(Kid.class);
        Kid kido = template.queryForObject(sql, rowMapper, KKID);
        return kido;
    }
}
