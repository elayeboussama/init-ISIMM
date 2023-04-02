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
public class Semestre implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_semestre", nullable = false)
    private Long idSemestre;

    @Column(length = 100)
    private String name;

    @OneToMany(mappedBy = "semestre",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<Section> sections;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_niveau")
    private Niveau niveau;

    @ManyToMany
    @JoinColumn(name="id_unitesSems")
    private Set<Unite> unitesSemstre;



    public Semestre() {

    }

    public Semestre(String name, Niveau niveau ) {
        this.name = name;
        this.sections = new HashSet<>();
        this.niveau = niveau;
        this.unitesSemstre = new HashSet<>();
    }


    public Semestre(String name, Set<Section> sections, Niveau niveau, Set<Unite> unitesSems) {
        this.name = name;
        this.sections = sections;
        this.niveau = niveau;
        this.unitesSemstre = unitesSems;
    }

    public Semestre(String name, Niveau niveau, Set<Unite> unites) {
        this.name = name;
        this.niveau = niveau;
        this.unitesSemstre = unites;
    }


    public void addUnite(Unite unite) {
        this.unitesSemstre.add(unite);
    }
    public void addSections(Section section) {
        this.sections.add(section);
    }
}

