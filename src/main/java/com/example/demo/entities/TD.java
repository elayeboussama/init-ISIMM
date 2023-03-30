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
public class TD implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_td", nullable = false)
    private Long idTd;

    @Column(length = 100)
    private String name;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tds")
    private Section section;

    @OneToMany(mappedBy = "td", fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<TP> tps;

    @OneToMany(mappedBy = "td", fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<Etudiant> etudiants ;

    public TD() {

    }

    public TD(String name, Section section, Set<TP> tps, Set<Etudiant> etudiants) {
        this.name = name;
        this.section = section;
        this.tps = tps;
        this.etudiants = etudiants;
    }

    public TD(String name, Section section ) {
        this.name = name;
        this.section = section;
        this.tps = new HashSet<>();
        this.etudiants = new HashSet<>();
    }

    public TD(String name, Section section, Set<TP> tps) {
        this.name = name;
        this.section = section;
        this.tps = tps;
    }

    public void addTp(TP tp) {
        this.tps.add(tp);
    }

    public void addEtudiant(Etudiant etudiant) {
        this.etudiants.add(etudiant);
    }
}
