package com.prashanthvangari.springbootlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value = "/api/")
@Scope
public class TestController2 {
    @Autowired
    User user;

    public TestController2(){
        System.out.println("Testcontroller2 is created");
    }

    @PostConstruct
    public void init(){
        System.out.println("Testcontroller2 hashcode is: "+this.hashCode()+ "User object hashcode is: "+user.hashCode());
    }
}
