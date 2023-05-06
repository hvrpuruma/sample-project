package com.harsha.sampleproject.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public String getResponse() {
        return "Hello";
    }

}
