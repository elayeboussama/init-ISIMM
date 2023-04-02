package com.example.demo.entities;


import com.example.demo.entities.enums.TypeDevoir;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
public class Note implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_note", nullable = false)
    private Long idNote;

    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name="id_matiere")
    private Matiere matiere;
    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name="id_etudiant")
    private Etudiant etudiant;
    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name="id_enseingant")
    private Enseignant enseingant;


    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name="id_semestre")
    private Semestre semestre;


    @Column
    private TypeDevoir type;

private float note;
private Date date;
    public Note() {

    }

    public Note(Matiere matiere, Etudiant etudiant, Enseignant enseingant, TypeDevoir type, float note, Date date) {

        this.matiere = matiere;
        this.etudiant = etudiant;
        this.enseingant = enseingant;
        this.type = type;
        this.note = note;
        this.date = date;
    }
    public Note(Matiere matiere, Etudiant etudiant, Enseignant enseingant, TypeDevoir type, float note, Date date, Semestre semestre) {

        this.matiere = matiere;
        this.etudiant = etudiant;
        this.enseingant = enseingant;
        this.type = type;
        this.note = note;
        this.date = date;
        this.semestre = semestre;
    }
}

