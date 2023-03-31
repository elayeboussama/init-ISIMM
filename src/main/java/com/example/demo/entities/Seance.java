package com.example.demo.entities;

import com.example.demo.entities.enums.TypeSeance;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Seance")
@Getter
@Setter
@AllArgsConstructor
public class Seance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_seance", nullable = false)
    private Long idSeance;


    @Column
    private TypeSeance type;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_emploi")
    private Emploi emploi;
    @JsonBackReference
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_salle")
    private Salle salle;

    @Column
    private Date date;


    @Column
    private Time tempDebut;

    @Column
    private Time tempFin;



    // un seul enseignant pour la destribution des charges & deux enseignants pour la destribution des examens et ds
    @ManyToMany
    @JoinTable(name = "enseignant_seance", joinColumns = {@JoinColumn(name = "id_Seance")}, inverseJoinColumns = {@JoinColumn(name = "id_enseignant")})
    private Set<Enseignant> enseignant;



    public Seance() {
    }

    public Seance(TypeSeance type, Emploi emploi, Salle salle, Date date, Time tempDebut, Time tempFin, Set<Enseignant> enseignant) {
        this.type = type;
        this.emploi = emploi;
        this.salle = salle;
        this.date = date;
        this.tempDebut = tempDebut;
        this.tempFin = tempFin;
        this.enseignant = enseignant;
    }

    public Seance(TypeSeance type, Emploi emploi, Salle salle, Date date, Time tempDebut, Time tempFin) {
        this.type = type;
        this.emploi = emploi;
        this.salle = salle;
        this.date = date;
        this.tempDebut = tempDebut;
        this.tempFin = tempFin;
        this.enseignant = new HashSet<>();
    }

    public void addEnseignant(Enseignant enseignant) {
        this.enseignant.add(enseignant);
    }
}
