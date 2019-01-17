package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping(value = "/")
    public String greeting(ModelMap map){
        User user1 = new User();
        user1.setName("Urvashi");
        map.addAttribute("greeting","Welcome ");
        map.addAttribute("username",user1.getName());
        return "index";
    }

}
