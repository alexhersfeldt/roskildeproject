package com.firstproject.roskildedayproject.Controller;


import com.firstproject.roskildedayproject.Model.Kid;
import com.firstproject.roskildedayproject.Model.Teacher;
import com.firstproject.roskildedayproject.Model.WorkSchedule;
import com.firstproject.roskildedayproject.Service.IKidServ;
import com.firstproject.roskildedayproject.Service.ITeacherServ;
import com.firstproject.roskildedayproject.Service.IWorkScheduleServ;
import com.firstproject.roskildedayproject.Service.WorkScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DayCareController {

    @Autowired
    ITeacherServ teacherService;
    @Autowired
    IKidServ kidService;
    @Autowired
    IWorkScheduleServ workScheduleService;


    @GetMapping("/index") //done
    public String Index() {
        return "index";
    }




    @GetMapping("/teacher") //Done
    public String Teacher(){
        return "teacherR";
    }



    @GetMapping("/ocean")
    public String Home2(Model model) {
        List<Kid> kidList = kidService.fetchALL();
        model.addAttribute("tablekid", kidList);
        return "oceanR";
    }
    @GetMapping("/viewkid/{KKID}")
    public String Viewkid(@PathVariable("KKID") int KKID, Model model) {
        model.addAttribute("tablekid", kidService.findKidByKid(KKID));
        return "viewkid";
    }


    @GetMapping("/admin")
    public String Home3(Model model){
        return"admin";
    }


    @GetMapping("/teacherList")
    public String Home(Model model) {
        List<Teacher> teacherList = teacherService.fetchAll();
        model.addAttribute("tableteacher", teacherList);
        return "teacherList";
    }


    @GetMapping("/viewTeacher/{TID}")
    public String ViewTeacher(@PathVariable("TID") int TID, Model model) {
        model.addAttribute("tableteacher", teacherService.findTeacherByTid(TID));
        return "viewteacher";
    }

    @PostMapping("/create")
    public String create(Teacher teacher){
        teacherService.addTeacher(teacher);
        return "redirect:/teacherList";
    }

    @GetMapping("/pupils") //done
    public String Home4(Model model) {
        List<Kid> kidListAll= kidService.fetchAllKids();
        model.addAttribute("tablekidsall", kidListAll);
        return "pupils";
    }


    @GetMapping("/viewkidsall/{KKID}") //done
    public String ViewkidsAll(@PathVariable("TID") int KKID, Model model) {
        model.addAttribute("tablekidsall", kidService.findKidByKid(KKID));
        return "viewkidsall";
    }

    @GetMapping("/schedule") //done
    public String Home5(Model model) {
        List<WorkSchedule> scheduleList= workScheduleService.fetchALL();
        model.addAttribute("tableschedule", scheduleList);
        return "schedule";
    }

    @GetMapping("/viewschedule/{WSID}") //done
    public String ViewSchedule(@PathVariable("WSID") int WSID, Model model) {
        model.addAttribute("tableschedule", workScheduleService.findWorkScheduleByWsid(WSID));
        return "viewschedule";
    }


}