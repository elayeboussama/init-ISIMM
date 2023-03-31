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
public class Service implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "idService", nullable = false)
    private Long idService;

    @Column(length = 100)
    private String name;

    @ManyToMany
    @JoinColumn(name="id_employers")
    private Set<Employer> employers;



    @OneToMany(mappedBy = "service",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<DemandeStockable> demandeStockable;


    @OneToMany(mappedBy = "service",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<Stockable> stockables;

    public Service() {

    }

    public Service(String name, Set<Employer> employers, Set<Stockable> stockables, Set<DemandeStockable> demandeStockable) {
        this.name = name;
        this.employers = employers;
        this.stockables = stockables;
        this.demandeStockable = demandeStockable;

    }

    public Service(String name) {
        this.name = name;
        this.employers = new HashSet<>();
        this.stockables = new HashSet<>();
        this.demandeStockable = new HashSet<>();

    }

    public void addEmployers(Employer employer) {
        this.employers.add(employer);
    }
    public void addStockable(Stockable stockable) {
        this.stockables.add(stockable);
    }
    public void addDemandeStockable(DemandeStockable demandeStockable) {
        this.demandeStockable.add(demandeStockable);
    }

    public boolean confirmer(DemandeStockable ds){ return true;}
}

