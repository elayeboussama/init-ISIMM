package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
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
    @JsonManagedReference
    private Set<Stockable> stockables;

    public DemandeUnstockable() {

    }
    public DemandeUnstockable(int quantite, DemandeStockable demandeStockable) {
        this.quantite = quantite;
        this.demandeStockable = demandeStockable;
        this.stockables  = new HashSet<>();
    }

    public DemandeUnstockable(int quantite, DemandeStockable demandeStockable, Set<Stockable> stockables) {
        this.quantite = quantite;
        this.demandeStockable = demandeStockable;
        this.stockables  = stockables;
    }

    public void addStockable(Stockable stockable) {
        this.stockables.add(stockable);

    }
}
