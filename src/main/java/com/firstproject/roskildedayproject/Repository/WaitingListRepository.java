package com.firstproject.roskildedayproject.Repository;

import com.firstproject.roskildedayproject.Model.WaitingList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WaitingListRepository implements IWaitingListRepo {

    @Autowired
    JdbcTemplate template;



    @Override
    public List<WaitingList> fetchALL() {
        String sql = "SELECT * FROM waiting_list";
        RowMapper<WaitingList> rowMapper = new BeanPropertyRowMapper<>(WaitingList.class);
        return template.query(sql, rowMapper);
    }

    @Override
    public WaitingList findWaitingListByWlid(int WLID) {
        String sql = "SELECT * FROM waiting_list WHERE WLID=?";
        RowMapper<WaitingList> rowMapper = new BeanPropertyRowMapper<>(WaitingList.class);
        WaitingList waitList  = template.queryForObject(sql, rowMapper, WLID);
        return waitList;
    }
}

