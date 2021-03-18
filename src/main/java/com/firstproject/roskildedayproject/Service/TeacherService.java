package com.firstproject.roskildedayproject.Service;

import com.firstproject.roskildedayproject.Model.Teacher;
import com.firstproject.roskildedayproject.Repository.ITeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements ITeacherServ {
    @Autowired
    ITeacherRepo teacherRepo;

    @Override
    public List<Teacher> fetchAll() {
        return teacherRepo.fetchAll();
    }

    @Override
    public Teacher findTeacherByTid(int TID) {
        return teacherRepo.findTeacherByTid(TID);
    }
}
