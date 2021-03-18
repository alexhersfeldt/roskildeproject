package com.firstproject.roskildedayproject.Service;

import com.firstproject.roskildedayproject.Model.KidGuardRelation;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IKidGuardServ {
    List<KidGuardRelation> fetchALL();

    KidGuardRelation findKidGuardInfoByGid(int KKID, int GID);
}
