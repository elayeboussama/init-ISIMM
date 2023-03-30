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

    private Set<EnseignantMatiere> enseignantMatiere ;

    public Matiere() {

    }


    public Matiere(String name, float credit, int coeffCr, int coeffTd, int coeffTp, int coeffCri, int coeffNp, int code, int nbHCr, int nbHTd, int nbHTp, int nbHCri, int nbHNp, Regime regime, Unite unite, Set<Note> notes, Set<EnseignantMatiere> enseignantMatiere) {
        this.name = name;
        this.credit = credit;
        this.coeffCr = coeffCr;
        this.coeffTd = coeffTd;
        this.coeffTp = coeffTp;
        this.coeffCri = coeffCri;
        this.coeffNp = coeffNp;
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


    public Matiere(String name, float credit, int coeffCr, int coeffTd, int coeffTp, int coeffCri, int coeffNp, int code, int nbHCr, int nbHTd, int nbHTp, int nbHCri, int nbHNp, Regime regime, Unite unite ) {
        this.name = name;
        this.credit = credit;
        this.coeffCr = coeffCr;
        this.coeffTd = coeffTd;
        this.coeffTp = coeffTp;
        this.coeffCri = coeffCri;
        this.coeffNp = coeffNp;
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

    @OneToMany(mappedBy = "matiere")
    @JsonManagedReference
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

