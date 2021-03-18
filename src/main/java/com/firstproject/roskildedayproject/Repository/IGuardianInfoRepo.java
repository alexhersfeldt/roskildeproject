package com.firstproject.roskildedayproject.Repository;

import com.firstproject.roskildedayproject.Model.GuardianInfo;

import java.util.List;

public interface IGuardianInfoRepo {

    List<GuardianInfo> fetchAll();

    GuardianInfo findGuardianInfoByGid(int GID);
}

