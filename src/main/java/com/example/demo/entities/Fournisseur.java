package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
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
    @JoinColumn(name="id_factures")
    Set<Facture> factures;

    public Fournisseur(String name, Set<Facture> factures) {
        this.name = name;
        this.factures = factures;
    }

    public Fournisseur(String name ) {
        this.name = name;
        this.factures  = new HashSet<>();
    }

    public Fournisseur() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void addFacture(Facture facture) {
        this.factures.add(facture);
    }
}
//Constructors

//Getters and Setters
