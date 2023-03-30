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
public class TP implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_tp", nullable = false)
    private Long idTp;

    @Column(length = 100)
    private String name;

    @OneToMany(mappedBy = "tp", fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<Etudiant> etudiants ;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name="tps")
    private TD td;

    public TP() {
    }

    public TP(String name, TD td) {
        this.name = name;
        this.td = td;
        this.etudiants = new HashSet<>();
    }

    public TP(String name, Set<Etudiant> etudiants, TD td) {
        this.name = name;
        this.etudiants = etudiants;
        this.td = td;
    }

    public void addEtudiant(Etudiant etudiant) {
        this.etudiants.add(etudiant);
    }
}
//Constructors

//Getters and Setters
