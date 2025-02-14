package org.example.spring_zoo;

import org.springframework.beans.factory.annotation.Value;

public class Crocodile implements Animal{
    @Value("${Crocodile.name}")
    private String name;

    @Override
    public void makeSound(){
        System.out.println("Шшши!");
    }
    public void name(@Value("${animal.name}") String name){
        this.name=name;
    }

    @Override
    public String getName(){
        return name;
    }
}