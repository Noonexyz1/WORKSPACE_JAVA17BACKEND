package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student maria = new Student("Maria", "Calle", "asdf@gmail.com", 23);
            studentRepository.save(maria);
        };
    }

}
