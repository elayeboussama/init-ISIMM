package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class DemandeUnstockable implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_demande_unstockable", nullable = false)
    private Long idDemandeUnstockable;

    @Column(length = 100)
    private String name;


    @OneToOne(mappedBy = "demandeUnstockable")
    private DemandeStockable demandeStockable;


    @OneToMany(mappedBy = "demandeUnstockable",fetch=FetchType.LAZY)
    private Set<Stockable> stockables;


}
