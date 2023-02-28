package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class TP implements Serializable {

    @Id
    @GeneratedValue
    private Long idTp;

    @Column(length = 100)
    private String name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tps")
    private TD td;

    public TP() {
    }

    public TP(String name, TD td) {
        this.name = name;
        this.td = td;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TD getTd() {
        return td;
    }

    public void setTd(TD td) {
        this.td = td;
    }
}
//Constructors

//Getters and Setters
