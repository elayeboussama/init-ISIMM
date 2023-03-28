package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
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




    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tds")
    private Section section;

    @OneToMany(mappedBy = "td", fetch = FetchType.LAZY)
    private Set<TP> tps;

    @OneToMany(mappedBy = "td", fetch = FetchType.LAZY)
    private Set<Etudiant> etudiants;

    public TD() {

    }

    public TD(String name, Section section, Set<TP> tps) {
        this.name = name;
        this.section = section;
        this.tps = tps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Set<TP> getTps() {
        return tps;
    }

    public void setTps(Set<TP> tps) {
        this.tps = tps;
    }
}
//Constructors

//Getters and Setters
