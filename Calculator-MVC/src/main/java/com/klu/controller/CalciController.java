package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.service.CalciService;

@RestController 
@RequestMapping("/Calculator")
public class CalciController {

    @Autowired
    CalciService service;

    
    @RequestMapping("/add/{a}/{b}")
    public int add(@PathVariable int a, @PathVariable int b) {
        return service.add(a, b);
    }

    
    @RequestMapping("/subtract/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b) {
        return service.subtract(a, b);
    }

    
    @RequestMapping("/multiply/{a}/{b}")
    public int multiply(@PathVariable int a, @PathVariable int b) {
        return service.multiply(a, b);
    }
}
