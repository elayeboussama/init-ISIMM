package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
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
        return matieres;
    }

    public void setMatieres(Set<Matiere> matieres) {
        this.matieres = matieres;
    }

    public int getCoeffCr() {
        return coeffCr;
    }

    public void setCoeffCr(int coeffCr) {
        this.coeffCr = coeffCr;
    }

    public int getCoeffTd() {
        return coeffTd;
    }

    public void setCoeffTd(int coeffTd) {
        this.coeffTd = coeffTd;
    }

    public int getCoeffTp() {
        return coeffTp;
    }

    public void setCoeffTp(int coeffTp) {
        this.coeffTp = coeffTp;
    }

    public int getCoeffCri() {
        return coeffCri;
    }

    public void setCoeffCri(int coeffCri) {
        this.coeffCri = coeffCri;
    }

    public int getCoeffNp() {
        return coeffNp;
    }

    public void setCoeffNp(int coeffNp) {
        this.coeffNp = coeffNp;
    }
}
//Constructors

//Getters and Setters
