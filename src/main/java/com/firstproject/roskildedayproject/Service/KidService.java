package com.firstproject.roskildedayproject.Service;

import com.firstproject.roskildedayproject.Model.Kid;
import com.firstproject.roskildedayproject.Repository.IKidRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KidService implements  IKidServ{

    @Autowired
    IKidRepo kidRepo;

    @Override
    public List<Kid> fetchAllKids(){return kidRepo.fetchAllKids();}

    @Override
    public List<Kid> fetchALL() { return kidRepo.fetchALL(); }

    @Override
    public Kid findKidByKid(int KKID) { return kidRepo.findKidByKid(KKID); }
}

