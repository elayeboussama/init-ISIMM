package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
public class Magasin implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_magasin", nullable = false)
    private Long idMagasin;

    @Column(length = 100)
    private String name;

    @OneToMany(mappedBy = "magasin",fetch=FetchType.LAZY)
    private Set<DemandeStockable> demandeStockables;


    @OneToMany(mappedBy = "magasin",fetch=FetchType.LAZY)
    private Set<Stockable> stockables;




    public Magasin() {

    }

    public Magasin(String name, Set<DemandeStockable> demandeStockables, Set<Stockable> stockables) {
        this.name = name;
        this.demandeStockables = demandeStockables;
        this.stockables = stockables;
    }

    public Set<DemandeStockable> getDemandeStockables() {
        return demandeStockables;
    }

    public void setDemandeStockables(Set<DemandeStockable> demandeStockables) {
        this.demandeStockables = demandeStockables;
    }

    public Set<Stockable> getStockables() {
        return stockables;
    }

    public void setStockables(Set<Stockable> stockables) {
        this.stockables = stockables;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean confirmer(DemandeStockable ds){ return true;}


}
//Constructors

//Getters and Setters
