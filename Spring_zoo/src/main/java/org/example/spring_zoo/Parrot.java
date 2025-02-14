package org.example.spring_zoo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot implements Animal{
    @Value("${Parrot.name}")
    private String name;

    @Override
    public void makeSound(){
        System.out.println("Чирик-чирик!");
    }
    public void name(@Value("${animal.name}") String name){
        this.name=name;
    }

    @Override
    public String getName(){
        return name;
    }
}