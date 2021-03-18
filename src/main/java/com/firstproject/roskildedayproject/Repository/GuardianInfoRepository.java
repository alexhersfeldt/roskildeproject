package com.firstproject.roskildedayproject.Repository;

import com.firstproject.roskildedayproject.Model.GuardianInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GuardianInfoRepository implements IGuardianInfoRepo{

    @Autowired
    JdbcTemplate template;

    @Override
    public List<GuardianInfo> fetchAll() {
        String sql = "SELECT * FROM guardian_info";
        RowMapper<GuardianInfo> rowMapper = new BeanPropertyRowMapper<>(GuardianInfo.class);
        return template.query(sql, rowMapper);
    }

    @Override
    public GuardianInfo findGuardianInfoByGid(int GID) {
        String sql = "SELECT * FROM guardian_info WHERE GID=?";
        RowMapper<GuardianInfo> rowMapper = new BeanPropertyRowMapper<>(GuardianInfo.class);
        GuardianInfo guardian = template.queryForObject(sql, rowMapper,GID);
        return guardian;

    }
}
