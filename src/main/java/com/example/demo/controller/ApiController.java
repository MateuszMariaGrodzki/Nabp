package com.example.demo.controller;

import com.example.demo.model.Currency;
import com.example.demo.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// rest controller daje adnotacje controller oraz do kazdej akcji kontrollera dorzuca adnotacje
// response body
@RequestMapping("api")
@RestController
public class ApiController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/exchangerates/{code}")
    public Currency index(@PathVariable String code){
        return currencyService.getCurrency(code);
    }


}
