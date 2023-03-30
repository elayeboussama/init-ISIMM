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
public class FactureStockable implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_facture_stockable", nullable = false)
    private Long idFactureStockable;

    @Column
    private int quantite;

    @Column
    private float prix;

    @Column
    private float tva;


    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_demande_unstockable")
    private DemandeUnstockable demandeUnstockable;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_magasin" )
    private Magasin magasin;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_service" )
    private Service service;

    @ManyToMany
    Set<Facture> factures ;

    public FactureStockable() {
    }

    public FactureStockable(int quantite, float prix, float tva, DemandeUnstockable demandeUnstockable, Magasin magasin, Service service, Set<Facture> factures) {
        this.quantite = quantite;
        this.prix = prix;
        this.tva = tva;
        this.demandeUnstockable = demandeUnstockable;
        this.magasin = magasin;
        this.service = service;
        this.factures = factures;
    }

    public FactureStockable(int quantite, float prix, float tva, DemandeUnstockable demandeUnstockable, Magasin magasin, Service service ) {
        this.quantite = quantite;
        this.prix = prix;
        this.tva = tva;
        this.demandeUnstockable = demandeUnstockable;
        this.magasin = magasin;
        this.service = service;
        this.factures  = new HashSet<>();
    }



    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }


    public void addFacture(Facture facture) {
        this.factures.add(facture);
    }

}

