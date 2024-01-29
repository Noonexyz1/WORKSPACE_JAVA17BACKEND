package com.example;

import com.example.demo2.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Set;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            ClientRepository clientRepository,
            UserRepository userRepository,
            AddressRepository addressRepository
    ){
        return args -> {
            //En este caso, primero se debe crear un usuario para tener un cliente, tabla user es fuerte
            //debido a que yo lo declare asi en la clase Client
            User user = new User("Diegoxyz111", "123");
            userRepository.save(user);

            //el usuario que necesita Client, ya debe de existir, asi que primero lo traemos
            Client client = new Client("Diego Mamani Ramos", user, null);
            clientRepository.save(client);

            Address address1 = new Address("Calle Romero", "78545-AGD", client);
            Address address2 = new Address("Calle San Lorenzo", "78545-AGD", client);
            Address address3 = new Address("Calle Retamas", "78545-AGD", client);
            Address address4 = new Address("Zona Las Lomas", "78545-AGD", client);
            addressRepository.save(address1);
            addressRepository.save(address2);
            addressRepository.save(address3);
            addressRepository.save(address4);

            client.setAddresses(Set.of(address1, address2, address3, address4));


        };

    }

}
