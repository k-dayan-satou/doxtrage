package com.handsengineering.doxtrage.controller.api.v1.impls;

import org.springframework.stereotype.Component;

import com.handsengineering.doxtrage.controller.api.v1.model.Doclet;

@Component
public class DoxtrageAPIImpl {

    public Doclet hello() {
        return new Doclet("Hello", "Hello, world!", new String[] { "https://www.handsengineering.com" });
    }
    
}
