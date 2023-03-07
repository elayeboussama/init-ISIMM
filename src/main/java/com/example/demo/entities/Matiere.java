package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Matiere implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_matiere", nullable = false)
    private Long idMatiere;

    @Column(length = 100)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="SA")
    private StaffAdministratif SA;
    private float credit;

    private float coeff;


    private int code;









    private int nbHCr;
    private int nbHTd;
    private int nbHTp;
    private int nbHCri;
    private int nbHNp;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="matieres")
    private Enseignant enseignant;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="matieresRegim")
    private Regime regime;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="unite")
    private Unite unite;



    @OneToMany(mappedBy = "matiere",fetch=FetchType.LAZY)
    private Set<Note> notes;


    public Matiere() {

    }


    public Matiere(int code, String name, int nbHCr, int nbHTd, int nbHTp, int nbHCri, int nbHNp, Enseignant enseignant, Regime regime, Set<Note> notes, Unite unite, float credit, float coeff) {
        this.code = code;
        this.name = name;
        this.nbHCr = nbHCr;
        this.nbHTd = nbHTd;
        this.nbHTp = nbHTp;
        this.nbHCri = nbHCri;
        this.nbHNp = nbHNp;
        this.enseignant = enseignant;
        this.regime = regime;
        this.unite = unite;
        this.coeff = coeff;
        this.credit = credit;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StaffAdministratif getSA() {
        return SA;
    }

    public void setSA(StaffAdministratif SA) {
        this.SA = SA;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public float getCoeff() {
        return coeff;
    }

    public void setCoeff(float coeff) {
        this.coeff = coeff;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public Regime getRegime() {
        return regime;
    }

    public void setRegime(Regime regime) {
        this.regime = regime;
    }

    public Unite getUnite() {
        return unite;
    }

    public void setUnite(Unite unite) {
        this.unite = unite;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }
}
//Constructors

//Getters and Setters
