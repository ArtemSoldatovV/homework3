package org.example.spring_zoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringZooApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringZooApplication.class, args);
        Zoo zoo = context.getBean(Zoo.class);
        zoo.displayAnimalSounds();
        zoo.displayFavoriteAnimalSound();
    }

}
