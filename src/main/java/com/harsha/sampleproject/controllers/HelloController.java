package com.harsha.sampleproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String getResponse(@RequestParam(value = "name", defaultValue = "People") String name) {
        return "Hello " + name;
    }

}
