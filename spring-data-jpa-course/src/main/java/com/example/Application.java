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
            AddressRepository addressRepository,
            ProductRepository productRepository
    ){
        return args -> {

            User user = new User("Diegoxyz111", "123");
            User user2 = new User("LEO111", "123");
            userRepository.save(user);
            userRepository.save(user2);

            Client client = new Client("Diego Mamani Ramos", user, null, null);
            Client cliente2 = new Client("Leo Juan Marquez", user2, null, null);
            clientRepository.save(client);
            clientRepository.save(cliente2);

            Address address1 = new Address("Calle Romero", "78545-AGD", client);
            Address address2 = new Address("Calle San Lorenzo", "78545-AGD", client);
            Address address3 = new Address("Calle Retamas", "78545-AGD", client);
            Address address4 = new Address("Zona Las Lomas", "78545-AGD", client);
            addressRepository.save(address1);
            addressRepository.save(address2);
            addressRepository.save(address3);
            addressRepository.save(address4);

            //cada vez que cambies el estado de un objeto que ya ha sido guardado en la base de datos, necesitas
            //volver a guardar ese objeto para que los cambios se reflejen en la base de datos.
            client.setAddresses(Set.of(address1, address2, address3, address4));
            clientRepository.save(client);

            Product product1 = new Product("Agua", 45.788);
            Product product2 = new Product("Laptop", 458.788);
            Product product3 = new Product("Verduras", 78.788);
            Product product4 = new Product("Smart TV", 665.788);
            productRepository.save(product1);
            productRepository.save(product2);
            productRepository.save(product3);
            productRepository.save(product4);

            //cada vez que cambies el estado de un objeto que ya ha sido guardado en la base de datos, necesitas
            //volver a guardar ese objeto para que los cambios se reflejen en la base de datos.
            client.setProducts(Set.of(product1, product2));
            clientRepository.save(client);

        };

    }

}
