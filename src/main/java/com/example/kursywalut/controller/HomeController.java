package com.example.kursywalut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/calculator")
    public String calculate(ModelMap modelMap){
        modelMap.put("currencies",Arrays.asList("eur","usd"));
        return "calculator";
    }

    @GetMapping("/calculator/result")
    public String result(@RequestParam double amount, ModelMap modelMap){
        modelMap.put("currencies",Arrays.asList("eur","usd"));
        modelMap.put("amount",amount);
        return "result";
    }

}
