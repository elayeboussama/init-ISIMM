package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
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

    public Magasin(String name, Set<Service> services) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
//Constructors

//Getters and Setters
