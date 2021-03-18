package com.firstproject.roskildedayproject.Repository;

import com.firstproject.roskildedayproject.Model.WaitingList;

import java.util.List;

public interface IWaitingListRepo {

    List<WaitingList> fetchALL();

    WaitingList findWaitingListByWlid(int WLID);

}