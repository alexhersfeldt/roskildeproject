package com.firstproject.roskildedayproject.Controller;


import com.firstproject.roskildedayproject.Model.Teacher;
import com.firstproject.roskildedayproject.Service.ITeacherServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class DayCareController {

    @Autowired
    ITeacherServ teacherService;


    @GetMapping("/index")
    public String Index() {
        return "index";
    }



    @GetMapping("/teacher")
    public String Home(Model model) {
        List<Teacher> teacherList = teacherService.fetchAll();
        model.addAttribute("tableteacher", teacherList);
        return "teacher";
    }


    @GetMapping("/viewTeacher/{TID}")
    public String ViewTeacher(@PathVariable("TID") int TID, Model model) {
        model.addAttribute("tableteacher", teacherService.findTeacherByTid(TID));
        return "viewteacher";
    }

}