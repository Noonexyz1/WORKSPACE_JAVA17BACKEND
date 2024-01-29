package com.example.demo2;

import jakarta.persistence.*;

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


    public Client(String clientName, User clientUser) {
        this.clientName = clientName;
        this.clientUser = clientUser;
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

}
