package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
public class Fournisseur implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_fournisseur", nullable = false)
    private Long idFournisseur;

    @Column(length = 100)
    private String name;


    @ManyToMany
    Set<Facture> factures;

    public Fournisseur(String name, Set<Facture> factures) {
        this.name = name;
        this.factures = factures;
    }

    public Fournisseur() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Facture> getFactures() {
        return factures;
    }

    public void setFactures(Set<Facture> factures) {
        this.factures = factures;
    }
}
//Constructors

//Getters and Setters
