package org.example.spring_zoo;

import org.springframework.beans.factory.annotation.Value;

public class Сow implements Animal{
    @Value("${Cow.name}")
    private String name;

    @Override
    public void makeSound(){
        System.out.println("Мууу!");
    }
    public void name(@Value("${animal.name}") String name){
        this.name=name;
    }

    @Override
    public String getName(){
        return name;
    }
}