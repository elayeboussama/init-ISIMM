package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Diplome implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_diplome", nullable = false)
    private Long idDiplome;

    @Column(length = 100)
    private String nom;


    @OneToMany(mappedBy="diplome",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<Niveau> niveau;



    public Diplome() {

    }

    public Diplome(String nom, Set<Niveau> niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }
    public Diplome(String nom) {
        this.nom = nom;
        this.niveau  = new HashSet<>();
    }




    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Niveau> getNiveau() {
        return niveau;
    }

    public void setNiveau(Set<Niveau> niveau) {
        this.niveau = niveau;
    }

    public void addNiveau(Niveau niveau) {
        this.niveau.add(niveau);
    }
}
//Constructors

//Getters and Setters
