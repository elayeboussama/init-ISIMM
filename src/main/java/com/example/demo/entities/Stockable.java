package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
public class Stockable implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_stockable", nullable = false)
    private Long idStockable;

    @Column(length = 100)
    private String nom;



    @ManyToMany
    @JoinTable(name = "Stockable_facture_stockable", joinColumns = {@JoinColumn(name = "id_Stockable")}, inverseJoinColumns = {@JoinColumn(name = "id_facture_stockable")})
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
    public Stockable() {

    }
    public Stockable(String nom, Set<FactureStockable> factureStockables, DemandeUnstockable demandeUnstockable, Magasin magasin, Service service) {
        this.nom = nom;
        this.factureStockables = factureStockables;
        this.demandeUnstockable = demandeUnstockable;
        this.magasin = magasin;
        this.service = service;
    }


}
//Constructors

//Getters and Setters
