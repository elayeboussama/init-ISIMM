package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Facture implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_facture", nullable = false)
    private Long idFacture ;

    @Column(length = 100)
    private String name;


    @ManyToMany
    Set<FactureStockable> factureStockables;


}
//Constructors

//Getters and Setters
