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

    private int coeffCr;
    private int coeffTd;
    private int coeffTp;
    private int coeffCri;
    private int coeffNp;

    private int nbHCr;
    private int nbHTd;
    private int nbHTp;
    private int nbHCri;
    private int nbHNp;


    //public float formule(){}


    @OneToMany(mappedBy = "regime",fetch=FetchType.LAZY)
    @JsonManagedReference
    public Set<Matiere> matieres;


    public Regime() {

    }


    public Regime(String name, int coeffCr, int coeffTd, int coeffTp, int coeffCri, int coeffNp, int nbHCr, int nbHTd, int nbHTp, int nbHCri, int nbHNp, Set<Matiere> matieres) {
        this.name = name;
        this.coeffCr = coeffCr;
        this.coeffTd = coeffTd;
        this.coeffTp = coeffTp;
        this.coeffCri = coeffCri;
        this.coeffNp = coeffNp;
        this.nbHCr = nbHCr;
        this.nbHTd = nbHTd;
        this.nbHTp = nbHTp;
        this.nbHCri = nbHCri;
        this.nbHNp = nbHNp;
        this.matieres = matieres;
    }

    public Regime(String name, int coeffCr, int coeffTd, int coeffTp, int coeffCri, int coeffNp, int nbHCr, int nbHTd, int nbHTp, int nbHCri, int nbHNp) {
        this.name = name;
        this.coeffCr = coeffCr;
        this.coeffTd = coeffTd;
        this.coeffTp = coeffTp;
        this.coeffCri = coeffCri;
        this.coeffNp = coeffNp;
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

