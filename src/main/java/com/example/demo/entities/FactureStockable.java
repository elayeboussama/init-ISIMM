package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class FactureStockable implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_facture_stockable", nullable = false)
    private Long idFactureStockable;

    @Column(length = 100)
    private String name;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_demande_unstockable")
    private DemandeUnstockable Stocka;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_magasin" )
    private Magasin magasin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_service" )
    private Service service;

    @ManyToMany
    Set<Facture> factures ;
}
//Constructors

//Getters and Setters
