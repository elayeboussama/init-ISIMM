package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Stockable implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_stockable", nullable = false)
    private Long idStockable;

    @Column(length = 100)
    private String name;


    @ManyToMany
    Set<FactureStockable> factureStockables;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_demande_unstockable" , referencedColumnName = "idDemandeUnstockable")
    private DemandeUnstockable demandeUnstockable;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_magasin")
    private Magasin magasin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_service" , referencedColumnName = "idService")
    private Service service;


}
//Constructors

//Getters and Setters
