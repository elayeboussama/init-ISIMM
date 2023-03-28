package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
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

    public FactureStockable() {
    }

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

    public FactureStockable(int quantite, float prix, float tva, DemandeUnstockable stocka, Magasin magasin, Service service, Set<Facture> factures) {
        this.quantite = quantite;
        this.prix = prix;
        this.tva = tva;
        Stocka = stocka;
        this.magasin = magasin;
        this.service = service;
        this.factures = factures;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getTva() {
        return tva;
    }

    public void setTva(float tva) {
        this.tva = tva;
    }

    public DemandeUnstockable getStocka() {
        return Stocka;
    }

    public void setStocka(DemandeUnstockable stocka) {
        Stocka = stocka;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
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
