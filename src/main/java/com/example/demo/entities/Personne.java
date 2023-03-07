package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
public class Personne implements Serializable {

    public enum Sexe{HOMME, FEMME};
    @Column(length = 100)
    private String cin;
    @Column(length = 100)
    private String nom;
    @Column(length = 100)
    private String prénom;

    private Date naissance;

    @Enumerated(EnumType.STRING)
    private Sexe sexe;
    @Column(length = 500)
    private String adresse ;
    @Column(length = 100)
    private String password;
    @Column(length = 100)
    private String email;
    @Column(length = 100)
    private String telephone;
    private int age;

    public Personne() {

    }

    public Personne(String cin, String nom, String prénom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age) {
        this.cin = cin;
        this.nom = nom;
        this.prénom = prénom;
        this.naissance = naissance;
        this.sexe = sexe;
        this.adresse = adresse;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
