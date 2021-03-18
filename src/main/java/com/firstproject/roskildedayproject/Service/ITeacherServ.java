package com.firstproject.roskildedayproject.Service;
import com.firstproject.roskildedayproject.Model.Teacher;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ITeacherServ {
    List<Teacher> fetchAll();

    Teacher findTeacherByTid(int TID);
}

