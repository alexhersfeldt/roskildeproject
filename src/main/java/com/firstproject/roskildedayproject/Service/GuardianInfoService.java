package com.firstproject.roskildedayproject.Service;

import com.firstproject.roskildedayproject.Model.GuardianInfo;
import com.firstproject.roskildedayproject.Repository.IGuardianInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuardianInfoService implements IGuardianInfoServ {

    @Autowired
    IGuardianInfoRepo guardianInfoRepo;

    @Override
    public List<GuardianInfo> fetchAll() { return guardianInfoRepo.fetchAll(); }

    @Override
    public GuardianInfo findGuardianInfoByGid(int GID) { return guardianInfoRepo.findGuardianInfoByGid(GID);}
}