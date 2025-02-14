package org.example.spring_zoo;

import org.springframework.beans.factory.annotation.Value;

public class Rooster implements Animal{
    @Value("${Rooster.name}")
    private String name;

    @Override
    public void makeSound(){
        System.out.println("Кукареку!");
    }
    public void name(@Value("${animal.name}") String name){
        this.name=name;
    }

    @Override
    public String getName(){
        return name;
    }
}