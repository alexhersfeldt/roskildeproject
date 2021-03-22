package com.firstproject.roskildedayproject.Repository;
import com.firstproject.roskildedayproject.Model.Kid;

import java.util.List;

public interface IKidRepo {

    List<Kid> fetchALL();

    Kid findKidByKid(int KKID);

    List<Kid> fetchAllKids();

}
