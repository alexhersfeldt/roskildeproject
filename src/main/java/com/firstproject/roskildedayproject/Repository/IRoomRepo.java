package com.firstproject.roskildedayproject.Repository;

import com.firstproject.roskildedayproject.Model.Room;

import java.util.List;

public interface IRoomRepo {

    List<Room> fetchALL();

    Room findRoomByRid(int RID);

}

