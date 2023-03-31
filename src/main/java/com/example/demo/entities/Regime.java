package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Regime implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_regime", nullable = false)
    private Long idRegime;

    @Column(length = 100)
    private String name;

    @Column
    private int coeff;

    @Column
    private int nbHCr;
    @Column
    private int nbHTd;
    @Column
    private int nbHTp;
    @Column
    private int nbHCri;
    @Column
    private int nbHNp;


    //public float formule(){}


    @OneToMany(mappedBy = "regime",fetch=FetchType.LAZY)
    @JsonManagedReference
    public Set<Matiere> matieres;


    public Regime() {

    }


    public Regime(String name, int coeff, int nbHCr, int nbHTd, int nbHTp, int nbHCri, int nbHNp, Set<Matiere> matieres) {
        this.name = name;
        this.coeff = coeff;
        this.nbHCr = nbHCr;
        this.nbHTd = nbHTd;
        this.nbHTp = nbHTp;
        this.nbHCri = nbHCri;
        this.nbHNp = nbHNp;
        this.matieres = matieres;
    }

    public Regime(String name,int coeff, int nbHCr, int nbHTd, int nbHTp, int nbHCri, int nbHNp) {
        this.name = name;
        this.coeff = coeff;
        this.nbHCr = nbHCr;
        this.nbHTd = nbHTd;
        this.nbHTp = nbHTp;
        this.nbHCri = nbHCri;
        this.nbHNp = nbHNp;
        this.matieres = new HashSet<>();
    }

    public void addMatiere(Matiere matiere) {
        this.matieres.add(matiere);
    }
}

