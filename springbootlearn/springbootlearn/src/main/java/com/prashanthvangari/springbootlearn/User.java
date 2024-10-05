package com.prashanthvangari.springbootlearn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
@Scope(value="singleton")
public class User {
    User(){
        System.out.println("User is created");
    }

    @PostConstruct
    public void init(){
        System.out.println("User object is created with hashcode: "+this.hashCode());
    }
}
