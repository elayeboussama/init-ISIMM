package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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



    @Column(length = 100)
    private String name;

    @Column
    private float credit;
    @Column
    private float coeff;

    @Column
    private int coeffExam;

    @Column
    private int coeffDs;

    @Column
    private int coeffTp;

    @Column
    private int coeffOral;
    @Column
    private int code;

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



    @JsonBackReference
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="matieres")
    private Regime regime;

    @JsonBackReference
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="unite")
    private Unite unite;



    @OneToMany(mappedBy = "matiere",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<Note> notes;

    @OneToMany(mappedBy = "matiere")
    @JsonManagedReference
    private Set<EnseignantMatiere> enseignantMatiere ;

    public Matiere() {

    }


    public Matiere(String name, float credit, float coeff, int coeffExam, int coeffDs, int coeffTp, int coeffOral, int code, int nbHCr, int nbHTd, int nbHTp, int nbHCri, int nbHNp, Regime regime, Unite unite, Set<Note> notes, Set<EnseignantMatiere> enseignantMatiere) {
        this.name = name;
        this.credit = credit;
        this.coeffExam = coeffExam;
        this.coeff = coeff;
        this.coeffDs = coeffDs;
        this.coeffTp = coeffTp;
        this.coeffOral = coeffOral;
        this.code = code;
        this.nbHCr = nbHCr;
        this.nbHTd = nbHTd;
        this.nbHTp = nbHTp;
        this.nbHCri = nbHCri;
        this.nbHNp = nbHNp;
        this.regime = regime;
        this.unite = unite;
        this.notes = notes;
        this.enseignantMatiere = enseignantMatiere;
    }


    public Matiere(String name, float credit,  float coeff, int coeffExam, int coeffDs, int coeffTp, int coeffOral, int code, int nbHCr, int nbHTd, int nbHTp, int nbHCri, int nbHNp, Regime regime, Unite unite ) {
        this.name = name;
        this.credit = credit;
        this.coeffExam = coeffExam;
        this.coeff = coeff;
        this.coeffDs = coeffDs;
        this.coeffTp = coeffTp;
        this.coeffOral = coeffOral;
        this.code = code;
        this.nbHCr = nbHCr;
        this.nbHTd = nbHTd;
        this.nbHTp = nbHTp;
        this.nbHCri = nbHCri;
        this.nbHNp = nbHNp;
        this.regime = regime;
        this.unite = unite;
        this.notes = new HashSet<>();
        this.enseignantMatiere  = new HashSet<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<EnseignantMatiere> getEnseignantMatiere() {
        return enseignantMatiere;
    }

    public void setEnseignantMatiere(Set<EnseignantMatiere> enseignantMatiere) {
        this.enseignantMatiere = enseignantMatiere;
    }

    public void addNotes(Note note) {
        this.notes.add(note);
    }

    public void addEnseignantMatiere(EnseignantMatiere enseignantMatiere) {
        this.enseignantMatiere.add(enseignantMatiere);
    }



}

