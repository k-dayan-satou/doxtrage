package com.handsengineering.doxtrage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handsengineering.doxtrage.controller.impls.DoxtrageAPIImpl;

@RestController
public class DoxtrageAPI {

    @Autowired
    private DoxtrageAPIImpl doxtrageAPIImpl;
    
    @GetMapping("/hello")   
    public String hello() {
        return doxtrageAPIImpl.hello() + " from DoxtrageAPI!";
    }
}
