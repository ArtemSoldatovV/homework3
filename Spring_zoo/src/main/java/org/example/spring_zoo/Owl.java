package org.example.spring_zoo;

import org.springframework.beans.factory.annotation.Value;

public class Owl implements Animal{
    @Value("${Owl.name}")
    private String name;

    @Override
    public void makeSound(){
        System.out.println("Уху!");
    }
    public void name(@Value("${animal.name}") String name){
        this.name=name;
    }

    @Override
    public String getName(){
        return name;
    }
}