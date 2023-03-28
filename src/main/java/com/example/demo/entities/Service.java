package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
public class Service implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "idService", nullable = false)
    private Long idService;

    @Column(length = 100)
    private String name;

    @ManyToMany
    private Set<Employer> employers;



    @OneToMany(mappedBy = "service",fetch=FetchType.LAZY)
    private Set<DemandeStockable> demandeStockable;


    @OneToMany(mappedBy = "service",fetch=FetchType.LAZY)
    private Set<Stockable> stockables;

    public Service() {

    }

    public Service(String name, Set<Employer> employers, Set<Stockable> stockables, Set<DemandeStockable> demandeStockable) {
        this.name = name;
        this.employers = employers;
        this.stockables = stockables;
        this.demandeStockable = demandeStockable;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(Set<Employer> employers) {
        this.employers = employers;
    }

    public Set<DemandeStockable> getDemandeStockable() {
        return demandeStockable;
    }

    public void setDemandeStockable(Set<DemandeStockable> demandeStockable) {
        this.demandeStockable = demandeStockable;
    }

    public Set<Stockable> getStockables() {
        return stockables;
    }

    public void setStockables(Set<Stockable> stockables) {
        this.stockables = stockables;
    }

    public boolean confirmer(DemandeStockable ds){ return true;}
}
//Constructors

//Getters and Setters
