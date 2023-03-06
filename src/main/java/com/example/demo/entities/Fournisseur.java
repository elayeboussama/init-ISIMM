package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Fournisseur implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_fournisseur", nullable = false)
    private Long idFournisseur;

    @Column(length = 100)
    private String name;


    @ManyToMany
    Set<Facture> factures;


}
//Constructors

//Getters and Setters
