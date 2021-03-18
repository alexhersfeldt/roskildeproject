package com.firstproject.roskildedayproject.Service;

import com.firstproject.roskildedayproject.Model.GuardianInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IGuardianInfoServ {
    List<GuardianInfo> fetchAll();

    GuardianInfo findGuardianInfoByGid(int GID);
}
