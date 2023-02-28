package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Personne implements Serializable {
    @Id
    @GeneratedValue
    private Long idPersonne;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String prenom;
    private int age;
    @Column(length = 100)
    private String adresse;

    public Personne() {

    }

    public Personne(String name, String prenom, int age, String adresse) {
        this.name = name;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
