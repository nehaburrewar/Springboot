package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {

    @Autowired
    Engine enigne;

    public Engine getEnigne() {
        return enigne;
    }

    public void setEnigne(Engine enigne) {
        this.enigne = enigne;
    }

    public Bike() {
        System.out.println("Bike Started");
    }

}


