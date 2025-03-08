package com.handsengineering.doxtrage.controller.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handsengineering.doxtrage.controller.api.v1.impls.DoxtrageAPIImpl;
import com.handsengineering.doxtrage.controller.api.v1.model.Doclet;

@RestController
@RequestMapping("/api/v1")
public class DoxtrageAPI {

    @Autowired
    private DoxtrageAPIImpl doxtrageAPIImpl;
    
    @GetMapping("/hello")   
    public Doclet hello() {
        return doxtrageAPIImpl.hello();
    }
}
