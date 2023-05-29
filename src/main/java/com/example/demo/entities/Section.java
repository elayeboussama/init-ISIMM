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
public class Section implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_section", nullable = false)
    private Long idSection;

    @Column(length = 100)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_semestre")
    @JsonBackReference
    private Semestre semestre;

    @OneToMany(mappedBy = "section", fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<TD> tds;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_semestre2")
    @JsonBackReference
    private Semestre semestre2;

    public Section() {

    }

    public Section(String name, Semestre semestre, Set<TD> tds) {
        this.name = name;
        this.semestre = semestre;
        this.tds = tds;
    }

    public Section(String name, Semestre semestre) {
        this.name = name;
        this.semestre = semestre;
        this.tds = new HashSet<>();
    }

    public Section(String name, Semestre semestre, Semestre semestre2, Set<TD> tds) {
        this.name = name;
        this.semestre = semestre;
        this.semestre2 = semestre2;
        this.tds = tds;
    }

    public Section(String name, Semestre semestre, Semestre semestre2) {
        this.name = name;
        this.semestre = semestre;
        this.semestre2 = semestre2;
        this.tds = new HashSet<>();
    }

    public void addTd(TD td) {
        this.tds.add(td);
    }
}

