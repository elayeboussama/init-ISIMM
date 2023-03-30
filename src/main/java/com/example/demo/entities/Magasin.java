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
public class Magasin implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_magasin", nullable = false)
    private Long idMagasin;

    @Column(length = 100)
    private String name;

    @OneToMany(mappedBy = "magasin",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<DemandeStockable> demandeStockables;


    @OneToMany(mappedBy = "magasin",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<Stockable> stockables;




    public Magasin() {

    }

    public Magasin(String name, Set<DemandeStockable> demandeStockables, Set<Stockable> stockables) {
        this.name = name;
        this.demandeStockables = demandeStockables;
        this.stockables = stockables;
    }

    public Magasin(String name) {
        this.name = name;
        this.demandeStockables = new HashSet<>();
        this.stockables = new HashSet<>();
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

    public void addStockable(Stockable stockable) {
        this.stockables.add(stockable);
    }

    public void addDemandeStockable(DemandeStockable demandeStockables) {
        this.demandeStockables.add(demandeStockables);
    }


}
//Constructors

//Getters and Setters
