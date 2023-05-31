package com.example.demo.entities;

import com.example.demo.entities.enums.TypeSeance;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
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

    @Column
    private String nom;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_emploi")
    @JsonBackReference
    private Emploi emploi;
    @JsonBackReference
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_salle")
    private Salle salle;


    @OneToOne
    @JoinColumn(name = "matiere_id")
    private Matiere matiere;
    private int sessionNumber;

    @JsonManagedReference
    @OneToMany(fetch=FetchType.LAZY)
    @JoinColumn(name="id_enseignant")
    private ArrayList<Enseignant> enseignants;




    @Column
    private Date date;


    @Column
    private LocalDateTime tempDebut;

    @Column
    private LocalDateTime tempFin;



    // un seul enseignant pour la destribution des charges & deux enseignants pour la destribution des examens et ds
    @ManyToMany
    @JoinTable(name = "enseignant_seance", joinColumns = {@JoinColumn(name = "id_Seance")}, inverseJoinColumns = {@JoinColumn(name = "id_enseignant")})
    private Set<Enseignant> enseignant;



    public Seance() {
    }

    public Seance(TypeSeance type, Emploi emploi, Salle salle, Date date, LocalDateTime tempDebut, LocalDateTime tempFin, Set<Enseignant> enseignant) {
        this.type = type;
        this.emploi = emploi;
        this.salle = salle;
        this.date = date;
        this.tempDebut = tempDebut;
        this.tempFin = tempFin;
        this.enseignant = enseignant;
    }

    public Seance(TypeSeance type, Emploi emploi, Salle salle, Date date, LocalDateTime tempDebut, LocalDateTime tempFin) {
        this.type = type;
        this.emploi = emploi;
        this.salle = salle;
        this.date = date;
        this.tempDebut = tempDebut;
        this.tempFin = tempFin;
        this.enseignant = new HashSet<>();
    }




    /****************************************************/
    public Seance(String name, Date date, LocalDateTime temps_debut, LocalDateTime temps_fin, Matiere matiere, int sessionNumber) {
        this.nom = name;
        this.date= date;
        this.tempDebut = temps_debut;
        this.tempFin  = temps_fin;
        this.matiere = matiere;
        this.sessionNumber = sessionNumber;
        this.enseignants = new ArrayList<>();
    }

    public void addEnseignant(Enseignant enseignant) {
        this.enseignant.add(enseignant);
    }








}
