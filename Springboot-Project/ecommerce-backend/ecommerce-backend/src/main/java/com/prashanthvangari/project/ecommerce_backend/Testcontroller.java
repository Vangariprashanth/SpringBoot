package com.prashanthvangari.project.ecommerce_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    
    @GetMapping(path = "/test")
    public String getTestMethod(){
        return "I am testing very good";
    }
}
