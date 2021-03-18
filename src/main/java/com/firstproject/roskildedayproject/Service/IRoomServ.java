package com.firstproject.roskildedayproject.Service;

import com.firstproject.roskildedayproject.Model.Room;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IRoomServ {
    List<Room> fetchALL();

    Room findRoomByRid(int RID);
}

