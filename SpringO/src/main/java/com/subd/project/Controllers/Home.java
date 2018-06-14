package com.subd.project.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Misheto on 15.6.2018 г..
 */

@Controller
public class Home {
    @GetMapping("/")
    public String getHomePage(){
        return "index";
    }
}
