package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
public class Section implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_section", nullable = false)
    private Long idSection;

    @Column(length = 100)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="semestre")
    private Semestre semestre;

    @OneToMany(mappedBy = "section", fetch = FetchType.LAZY)
    private Set<TD> tds;




    public Section() {

    }

    public Section(String name, Semestre semestre, Set<TD> tds) {
        this.name = name;
        this.semestre = semestre;
        this.tds = tds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Set<TD> getTds() {
        return tds;
    }

    public void setTds(Set<TD> tds) {
        this.tds = tds;
    }
}
//Constructors

//Getters and Setters
