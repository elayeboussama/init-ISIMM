package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class DemandeUnstockable implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "idDemandeUnstockable", nullable = false)
    private Long idDemandeUnstockable;

    @Column()
    private int quantite;


    @OneToOne(mappedBy = "demandeUnstockable")
    private DemandeStockable demandeStockable;


    @OneToMany(mappedBy = "demandeUnstockable",fetch=FetchType.LAZY)
    private Set<Stockable> stockables;

    public DemandeUnstockable() {

    }
    public DemandeUnstockable(int quantite, DemandeStockable demandeStockable, Set<Stockable> stockables) {
        this.quantite = quantite;
        this.demandeStockable = demandeStockable;
        this.stockables = stockables;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public DemandeStockable getDemandeStockable() {
        return demandeStockable;
    }

    public void setDemandeStockable(DemandeStockable demandeStockable) {
        this.demandeStockable = demandeStockable;
    }

    public Set<Stockable> getStockables() {
        return stockables;
    }

    public void setStockables(Set<Stockable> stockables) {
        this.stockables = stockables;
    }
}
