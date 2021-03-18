package com.firstproject.roskildedayproject.Service;
import com.firstproject.roskildedayproject.Model.Kid;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IKidServ {
    List<Kid> fetchALL();

    Kid findKidByKid(int KKID);
}
