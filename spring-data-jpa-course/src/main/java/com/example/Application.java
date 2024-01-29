package com.example;

import com.example.demo2.Client;
import com.example.demo2.ClientRepository;
import com.example.demo2.User;
import com.example.demo2.UserRepository;
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
    public CommandLineRunner commandLineRunner(
            ClientRepository clientRepository,
            UserRepository userRepository
    ){
        return args -> {
            //En este caso, primero se debe crear un usuario para tener un cliente, tabla user es fuerte
            //debido a que yo lo declare asi en la clase Client
            User user = new User("Diegoxyz111", "123");
            userRepository.save(user);

            //el usuario que necesita Client, ya debe de existir, asi que primero lo traemos
            Client client = new Client("Diego Mamani Ramos", user);
            clientRepository.save(client);


        };

    }


}
