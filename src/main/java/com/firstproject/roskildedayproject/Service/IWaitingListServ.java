package com.firstproject.roskildedayproject.Service;

import com.firstproject.roskildedayproject.Model.WaitingList;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IWaitingListServ {
    List<WaitingList> fetchALL();

    WaitingList findWaitingListByWlid(int WLID);
}
