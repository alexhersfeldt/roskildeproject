package com.firstproject.roskildedayproject.Service;

import com.firstproject.roskildedayproject.Model.WaitingList;
import com.firstproject.roskildedayproject.Repository.IWaitingListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaitingListService implements IWaitingListServ{

    @Autowired
    IWaitingListRepo waitingListRepo;


    @Override
    public List<WaitingList> fetchALL() { return waitingListRepo.fetchALL(); }

    @Override
    public WaitingList findWaitingListByWlid(int WLID) { return waitingListRepo.findWaitingListByWlid(WLID); }
}

