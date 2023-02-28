package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Diplome implements Serializable {

    @Id
    @GeneratedValue
    private Long idDiplome;

    @Column(length = 100)
    private String name;


    @OneToMany(mappedBy="diplome",fetch=FetchType.LAZY)
    private Set<Niveau> niveau;



    public Diplome() {

    }

    public Diplome(String name, Set<Niveau> niveau) {
        this.name = name;
        this.niveau = niveau;
    }

    public Diplome(String name ) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Niveau> getNiveau() {
        return niveau;
    }

    public void setNiveau(Set<Niveau> niveau) {
        this.niveau = niveau;
    }
}
//Constructors

//Getters and Setters
