package com.firstproject.roskildedayproject.Service;

import com.firstproject.roskildedayproject.Model.WorkSchedule;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IWorkScheduleServ {
    List<WorkSchedule> fetchALL();

    WorkSchedule findWorkScheduleByWsid(int WSID);
}