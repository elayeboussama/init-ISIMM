package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
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
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_demande_unstockable" , referencedColumnName = "idDemandeUnstockable")
    private DemandeUnstockable demandeUnstockable;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_magasin")
    private Magasin magasin;
    @JsonBackReference
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

    public Stockable(String nom, DemandeUnstockable demandeUnstockable, Magasin magasin, Service service) {
        this.nom = nom;
        this.factureStockables = new HashSet<>();
        this.demandeUnstockable = demandeUnstockable;
        this.magasin = magasin;
        this.service = service;
    }

    public void addFactureStockable(FactureStockable factureStockable) {
        this.factureStockables.add(factureStockable);
    }
}

