package com.example.kursywalut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

//z wykorzystaniem JavaScript

@Controller
public class HomeController {

    @GetMapping("/")
    public String home (ModelMap modelMap){
        modelMap.put("currencies", Arrays.asList("eur","usd"));
        return "home";
    }

    @GetMapping("/nbp")
    public String getNbp(ModelMap modelMap){
        modelMap.put("currencies",Arrays.asList("eur","usd"));
        return "nbp";
    }


}
