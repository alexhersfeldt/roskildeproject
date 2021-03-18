package com.firstproject.roskildedayproject.Service;

import com.firstproject.roskildedayproject.Model.WorkSchedule;
import com.firstproject.roskildedayproject.Repository.IWorkScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkScheduleService implements IWorkScheduleServ{

    @Autowired
    IWorkScheduleRepo workScheduleRepo;


    @Override
    public List<WorkSchedule> fetchALL() { return workScheduleRepo.fetchALL(); }

    @Override
    public WorkSchedule findWorkScheduleByWsid(int WSID) { return workScheduleRepo.findWorkScheduleByWsid(WSID); }
}

