package com.firstproject.roskildedayproject.Repository;

import com.firstproject.roskildedayproject.Model.WorkSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WorkScheduleRepository implements IWorkScheduleRepo {

    @Autowired
    JdbcTemplate template;

    @Override
    public List<WorkSchedule> fetchALL() {
        String sql = "SELECT * FROM work_schedule";
        RowMapper<WorkSchedule> rowMapper = new BeanPropertyRowMapper<>(WorkSchedule.class);
        return template.query(sql, rowMapper);
    }

    @Override
    public WorkSchedule findWorkScheduleByWsid(int WSID) {
        String sql = "SELECT * FROM work_schedule WHERE WSID=?";
        RowMapper<WorkSchedule> rowMapper = new BeanPropertyRowMapper<>(WorkSchedule.class);
        WorkSchedule work = template.queryForObject(sql, rowMapper, WSID);
        return work;
    }
}
