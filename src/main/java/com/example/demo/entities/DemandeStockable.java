package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class DemandeStockable implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_demande_stockable", nullable = false)
    private Long idDemandeStockable;

    @Column(length = 100)
    private String name;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_employer" )
    private Employer employer;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="idService")
    private Service service;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="magasin")
    private Magasin magasin;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_demande_unstockable" )
    private DemandeUnstockable demandeUnstockable;

    @ManyToMany
    Set<Stockable> stockable;



}
