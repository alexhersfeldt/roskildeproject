package com.firstproject.roskildedayproject.Repository;


import com.firstproject.roskildedayproject.Model.KidGuardRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KidGuardRepository  implements IKidGuardRelationRepo{
    @Autowired
    JdbcTemplate template;


    @Override
    public List<KidGuardRelation> fetchAll() {
        String sql = "SELECT * FROM kid_guard_relation";
        RowMapper<KidGuardRelation> rowMapper = new BeanPropertyRowMapper<>(KidGuardRelation.class);
        return template.query(sql, rowMapper);
    }

    @Override
    public KidGuardRelation findKidGuardInfoByGid(int KKID, int GID) {
        String sql = "SELECT * FROM kid_guard_relation WHERE (KKID, GID)";
        RowMapper<KidGuardRelation> rowMapper = new BeanPropertyRowMapper<>(KidGuardRelation.class);
        KidGuardRelation kidguard = template.queryForObject(sql, rowMapper,KKID, GID);
        return kidguard;
    }
}
