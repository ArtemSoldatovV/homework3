package org.example.spring_zoo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Monkey implements Animal{
    @Value("${Monkey.name}")
    private String name;

    @Override
    public void makeSound(){
        System.out.println("хихи!");
    }
    public void name(@Value("${animal.name}") String name){
        this.name=name;
    }

    @Override
    public String getName(){
        return name;
    }
}