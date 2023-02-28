package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Magasin implements Serializable {

    @Id
    @GeneratedValue
    private Long idService;

    @Column(length = 100)
    private String name;

    @OneToMany(mappedBy = "magasin",fetch=FetchType.LAZY)
    private Set<Service> services;


    public Magasin() {

    }

    public Magasin(String name, Set<Service> services) {
        this.name = name;
        this.services = services;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }
}
//Constructors

//Getters and Setters
