package com.firstproject.roskildedayproject.Repository;


import com.firstproject.roskildedayproject.Model.Teacher;

import java.util.List;

public interface ITeacherRepo {
    List<Teacher> fetchAll();

    Teacher findTeacherByTid(int TID);

}
