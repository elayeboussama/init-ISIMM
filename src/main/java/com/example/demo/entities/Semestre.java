package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
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
    private Set<Section> sections;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="niveau")
    private Niveau niveau;

    @ManyToMany
    private Set<Unite> unitesSems;



    public Semestre() {

    }

    public Semestre(String name, Niveau niveau, Set<Unite> unites) {
        this.name = name;
        this.niveau = niveau;
        this.unitesSems = unites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public Set<Unite> getUnites() {
        return unitesSems;
    }

    public void setUnites(Set<Unite> unites) {
        this.unitesSems = unites;
    }
}
//Constructors

//Getters and Setters
