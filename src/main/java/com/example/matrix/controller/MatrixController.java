package com.example.matrix.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatrixController {

    @RequestMapping(path = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello from Matrix";
    }

}
