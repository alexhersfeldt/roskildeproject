package com.firstproject.roskildedayproject.Service;

import com.firstproject.roskildedayproject.Model.Room;
import com.firstproject.roskildedayproject.Repository.IRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService implements IRoomServ{
    @Autowired
    IRoomRepo roomRepo;


    @Override
    public List<Room> fetchALL() { return roomRepo.fetchALL(); }

    @Override
    public Room findRoomByRid(int RID) { return roomRepo.findRoomByRid(RID); }
}
