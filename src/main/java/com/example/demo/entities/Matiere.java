package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Matiere")
@Getter
@Setter
public class Matiere implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_matiere", nullable = false)
    private Long idMatiere;

    private Set<EnseignantMatiere> enseignantMatiere = new HashSet<EnseignantMatiere>();

    @Column(length = 100)
    private String name;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="SA")
//    private StaffAdministratif SA;
    private float credit;

    private int coeffCr;
    private int coeffTd;
    private int coeffTp;
    private int coeffCri;
    private int coeffNp;
    private int code;

    private int nbHCr;
    private int nbHTd;
    private int nbHTp;
    private int nbHCri;
    private int nbHNp;


//    @ManyToMany(fetch=FetchType.LAZY)
//    @JoinTable(name = "matiere_enseignant", joinColumns = {@JoinColumn(name = "id_matiere")}, inverseJoinColumns = {@JoinColumn(name = "id_enseignant")})
//    private Set<Enseignant> enseignant;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="matieres")
    private Regime regime;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="unite")
    private Unite unite;



    @OneToMany(mappedBy = "matiere",fetch=FetchType.LAZY)
    private Set<Note> notes;


    public Matiere() {

    }


    public Matiere(int code, String name,int coeffCr, int coeffTd, int coeffTp, int coeffCri, int coeffNp, int nbHCr, int nbHTd, int nbHTp, int nbHCri, int nbHNp, Enseignant enseignant, Regime regime, Set<Note> notes, Unite unite, float credit, float coeff) {
        this.code = code;
        this.name = name;
        this.nbHCr = nbHCr;
        this.nbHTd = nbHTd;
        this.nbHTp = nbHTp;
        this.nbHCri = nbHCri;
        this.nbHNp = nbHNp;
//        this.enseignant = enseignant;
        this.regime = regime;
        this.unite = unite;
        this.coeffCr = coeffCr;
        this.coeffTd = coeffTd;
        this.coeffTp = coeffTp;
        this.coeffCri = coeffCri;
        this.coeffNp = coeffNp;
        this.credit = credit;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(Long idMatiere) {
        this.idMatiere = idMatiere;
    }
    @OneToMany(mappedBy = "matiere")
    public Set<EnseignantMatiere> getEnseignantMatiere() {
        return enseignantMatiere;
    }

    public void setEnseignantMatiere(Set<EnseignantMatiere> enseignantMatiere) {
        this.enseignantMatiere = enseignantMatiere;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
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

//    public Enseignant getEnseignant() {
//        return enseignant;
//    }
//
//    public void setEnseignant(Enseignant enseignant) {
//        this.enseignant = enseignant;
//    }

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
