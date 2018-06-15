package com.subd.project.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddStudent {

    @GetMapping("/addStudent")
    public String getHomePage(){
        return "index";
    }
}
