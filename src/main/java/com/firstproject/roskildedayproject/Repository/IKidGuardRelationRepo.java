package com.firstproject.roskildedayproject.Repository;

import com.firstproject.roskildedayproject.Model.KidGuardRelation;

import java.util.List;

public interface IKidGuardRelationRepo {

    List<KidGuardRelation> fetchAll();

    KidGuardRelation findKidGuardInfoByGid(int KKID, int GID);
}
