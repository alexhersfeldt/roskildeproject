package com.firstproject.roskildedayproject.Service;

import com.firstproject.roskildedayproject.Model.KidGuardRelation;
import com.firstproject.roskildedayproject.Repository.IKidGuardRelationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KidGuardService implements IKidGuardServ {
    @Autowired
    IKidGuardRelationRepo kidGuardRelationRepo;

    @Override
    public List<KidGuardRelation> fetchALL() {
        return kidGuardRelationRepo.fetchAll();
    }

    @Override
    public KidGuardRelation findKidGuardInfoByGid(int KKID, int GID) {
        return kidGuardRelationRepo.findKidGuardInfoByGid(KKID, GID);
    }
}
