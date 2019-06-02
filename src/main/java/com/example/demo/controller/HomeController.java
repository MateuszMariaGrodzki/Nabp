package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(ModelMap modelMap){
        modelMap.put("curriencies", Arrays.asList("eur" , "usd"));
        return "home";
    }

    @GetMapping("/nbp")
    public String getNbp(ModelMap modelMap){
        modelMap.put("curriences" , Arrays.asList("eur" , "usd"));
        return "nbp";
    }

}
