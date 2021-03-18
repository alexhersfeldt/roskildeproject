package com.firstproject.roskildedayproject.Repository;

import com.firstproject.roskildedayproject.Model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoomRepository  implements  IRoomRepo{
    @Autowired
    JdbcTemplate template;

    @Override
    public List<Room> fetchALL() {
        String sql = "SELECT * FROM room";
        RowMapper<Room> rowMapper = new BeanPropertyRowMapper<>(Room.class);
        return template.query(sql, rowMapper);
    }

    @Override
    public Room findRoomByRid(int RID) {
        String sql = "SELECT * FROM room WHERE RID=?";
        RowMapper<Room> rowMapper = new BeanPropertyRowMapper<>(Room.class);
        Room roomy= template.queryForObject(sql, rowMapper, RID);
        return roomy;
    }
}
