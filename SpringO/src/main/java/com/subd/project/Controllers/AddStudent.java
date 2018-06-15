package com.subd.project.Controllers;

import com.subd.project.Entities.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddStudent {

    @GetMapping("/addStudent")
    public String getAddStudent(Model model){
        model.addAttribute("student",new Student());
        return "addStudent";
    }

//    @PostMapping("/addStudent")
//    public String postAddStudent(@ModelAttribute Student studentData){
//        return "studentsTable";
//    }
}