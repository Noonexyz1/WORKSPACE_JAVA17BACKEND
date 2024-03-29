package com.example.demo2;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @SequenceGenerator(
            name = "client_sequence",
            sequenceName = "client_sequence",
            allocationSize = 1,
            initialValue = 999

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "client_sequence"
    )
    @Column(
            updatable = false
    )
    private Long clientId;
    private String clientName;


    @OneToOne   //Creamos la relacion Uno a Uno
    private User clientUser;

    @OneToMany(
            fetch = FetchType.EAGER,    //Esto para que me traiga todos aquellas relaciones que tiene este mi objeto
            cascade = CascadeType.ALL
    )  //Aqui creamos nuestra realcion de Uno a Muchos
    private Set<Address> addresses = new HashSet<>();



    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "client_product",    //Esto sera el nombre de la tabla
            joinColumns = {@JoinColumn(name = "fk_client")},
            inverseJoinColumns = {@JoinColumn(name = "fk_product")}
    )
    private Set<Product> products = new HashSet<>();


    public Client(String clientName, User clientUser, Set<Address> addresses, Set<Product> products) {
        this.clientName = clientName;
        this.clientUser = clientUser;
        this.addresses = addresses;
        this.products = products;
    }

    public Client(){}

    public Long getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public User getClientUser() {
        return clientUser;
    }

    public void setClientUser(User clientUser) {
        this.clientUser = clientUser;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", clientUser=" + clientUser +
                ", addresses=" + addresses +
                ", products=" + products +
                '}';
    }
}
