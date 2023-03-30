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
@Getter
@Setter
public class Niveau implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_niveau", nullable = false)
    private Long idNiveau;

    @Column(length = 100)
    private String name;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="myDiplome")
    private Diplome diplome;

    @OneToMany(mappedBy = "niveau",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<Semestre> semestres;










    public Niveau() {

    }

    public Niveau(String name, Set<Semestre> semestres) {
        this.name = name;
        this.semestres = semestres;
    }

    public Niveau(String name) {
        this.name = name;
        this.semestres = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void addSemestre(Semestre semestre) {
        this.semestres.add(semestre);
    }
}

