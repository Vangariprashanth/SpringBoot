package com.prashanthvangari.springbootlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value="/api/")
public class TestController1 {

    @Autowired
    User user;
    TestController1(){
        System.out.println("TestController1 is created");
    }

    @PostConstruct
    public void init(){
        System.out.println("Testcontroller1 hashcode is: "+this.hashCode()+ "User object hashcode: "+user.hashCode());
    }
}
