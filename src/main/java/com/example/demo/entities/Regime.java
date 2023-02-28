package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class Regime implements Serializable {

    @Id
    @GeneratedValue
    private Long idRegime;

    @Column(length = 100)
    private String name;



    private int nbHCr;
    private int nbHTd;
    private int nbHTp;
    private int nbHCri;
    private int nbHNp;


    //public float formule(){}


    @OneToMany(mappedBy = "regime",fetch=FetchType.LAZY)
    public Set<Matiere> matieresRegim;


    public Regime() {

    }

    public Regime(String name, int nbHCr, int nbHTd, int nbHTp, int nbHCri, int nbHNp, Set<Matiere> matieres) {
        this.name = name;
        this.nbHCr = nbHCr;
        this.nbHTd = nbHTd;
        this.nbHTp = nbHTp;
        this.nbHCri = nbHCri;
        this.nbHNp = nbHNp;
        this.matieresRegim = matieres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbHCr() {
        return nbHCr;
    }

    public void setNbHCr(int nbHCr) {
        this.nbHCr = nbHCr;
    }

    public int getNbHTd() {
        return nbHTd;
    }

    public void setNbHTd(int nbHTd) {
        this.nbHTd = nbHTd;
    }

    public int getNbHTp() {
        return nbHTp;
    }

    public void setNbHTp(int nbHTp) {
        this.nbHTp = nbHTp;
    }

    public int getNbHCri() {
        return nbHCri;
    }

    public void setNbHCri(int nbHCri) {
        this.nbHCri = nbHCri;
    }

    public int getNbHNp() {
        return nbHNp;
    }

    public void setNbHNp(int nbHNp) {
        this.nbHNp = nbHNp;
    }

    public Set<Matiere> getMatieres() {
        return matieresRegim;
    }

    public void setMatieres(Set<Matiere> matieres) {
        this.matieresRegim = matieres;
    }
}
//Constructors

//Getters and Setters
