package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Unite implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_unite", nullable = false)
    private Long idUnite;

    @Column(length = 100)
    private String name;

    @ManyToMany
    private Set<Semestre> semestres;

    public Unite() {

    }
    @OneToMany(mappedBy = "unite",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<Matiere> matieres;

    private float coef;

    private int  codeUnite ;

    private float credit;

    public Unite(int  codeUnite, String name, Set<Semestre> semestres, Set<Matiere> matieres, float coef, float credit) {
        this.name = name;
        this.semestres = semestres;
        this.matieres = matieres;
        this.coef = coef;
        this.credit = credit;
    }

    public Unite(int  codeUnite, String name, float coef, float credit) {
        this.name = name;
        this.semestres = new HashSet<>();
        this.matieres = new HashSet<>();
        this.coef = coef;
        this.credit = credit;
    }
    

    public void addMatiere(Matiere matiere) {
        this.matieres.add(matiere);
    }

    public void addSemestre(Semestre semestre) {
        this.semestres.add(semestre);
    }
}
//Constructors

//Getters and Setters
