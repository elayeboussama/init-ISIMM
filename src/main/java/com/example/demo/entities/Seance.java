package com.example.demo.entities;

import com.example.demo.entities.enums.typeSeance;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Emploi")
@Getter
@Setter
@AllArgsConstructor
public class Seance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_seance", nullable = false)
    private Long idSeance;


    @Column
    private typeSeance type;

    @ManyToOne(fetch=FetchType.LAZY)
    private Emploi emploi;

    @ManyToOne(fetch=FetchType.LAZY)
    private Salle salle;

    @Column
    private Date date;


    @Column
    private Time tempDebut;

    @Column
    private Time tempFin;



    // un seul enseignant pour la destribution des charges & deux enseignats pour la destribution des examens et ds
    @ManyToMany
    @JoinTable(name = "enseignant_seance", joinColumns = {@JoinColumn(name = "id_Seance")}, inverseJoinColumns = {@JoinColumn(name = "id_enseignant")})
    private Set<Enseignant> enseignant;



    public Seance() {
    }



}
