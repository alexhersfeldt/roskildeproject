package com.firstproject.roskildedayproject.Repository;


import com.firstproject.roskildedayproject.Model.WorkSchedule;

import java.util.List;

public interface IWorkScheduleRepo {
    List<WorkSchedule> fetchALL();

    WorkSchedule findWorkScheduleByWsid(int WSID);

}
