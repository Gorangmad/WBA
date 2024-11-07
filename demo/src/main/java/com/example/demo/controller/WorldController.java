package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class WorldController {
    @RequestMapping(value="demo", method=RequestMethod.GET)
    @ResponseBody
    public String getHelloWorld() {
    return "<h1>Hello World Spring Boot Teil 1!</h1>";
    }
}
