package com.lcwd.mvc.SpringMvcProject.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/login")
    public String showLoginPageHandler(){
        return "login";
    }

}
