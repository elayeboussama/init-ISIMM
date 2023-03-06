package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Service implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_service", nullable = false)
    private Long idService;

    @Column(length = 100)
    private String name;

    @ManyToMany
    private Set<Enseignant> enseignants;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="magasin")
//    private Magasin magasin;

    @OneToMany(mappedBy = "service",fetch=FetchType.LAZY)
    private Set<DemandeStockable> demandeStockable;


    @OneToMany(mappedBy = "service",fetch=FetchType.LAZY)
    private Set<Stockable> stockables;

    public Service() {

    }

    public Service(String name, Set<Enseignant> enseignants) {
        this.name = name;
        this.enseignants = enseignants;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Enseignant> getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(Set<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }
}
//Constructors

//Getters and Setters
