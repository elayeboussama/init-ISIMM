package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Voeux implements Serializable {

    @Id
    @GeneratedValue
    private Long idVoeux;

    @Column(length = 100)
    private String name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="SA")
    private StaffAdministratif SA;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="voeux")
    private Enseignant enseignant;



    public Voeux() {

    }

    public Voeux(String name, Enseignant enseignant) {
        this.name = name;
        this.enseignant = enseignant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }
}
//Constructors

//Getters and Setters
