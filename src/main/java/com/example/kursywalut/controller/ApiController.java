package com.example.kursywalut.controller;

import com.example.kursywalut.model.Currency;
import com.example.kursywalut.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
RestController adnotacja, które robi:
    @Controller
    oraz do każdej metody (czyli akcji kontrolera)
    dorzuca @ResponseBody
 */

@RequestMapping("/api")
@RestController
public class ApiController {

    @Autowired
    private CurrencyService currencyService;

    //  localhost8080/api/exchangerates/usd

    @GetMapping("/exchangerates/{code}")
    public Currency index(@PathVariable String code){
        return currencyService.getCurrency(code);
    }


}
