package com.subd.project.Controllers;

import com.subd.project.Config.SpringJdbcConfig;
import com.subd.project.JDBCSetup;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Home {
    @GetMapping("/")
    public String getHomePage(){
//        SpringJdbcConfig jdbcConfig = new SpringJdbcConfig();
////        JDBCSetup jdbc = new JDBCSetup();
////        jdbc.init(jdbcConfig.connection());
        return "index";
    }
}
