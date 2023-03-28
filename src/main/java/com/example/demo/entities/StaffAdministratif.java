package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name="StaffAdministratif")
@Getter
@Setter
public class StaffAdministratif extends Employer {

//    @Id
//    @GeneratedValue
//    @Column(name = "id_staff_administratif", nullable = false)
//    private Long idStaffAdministratif;

    public enum Type{OUVRIER, AGENT}
    private Type typeStaff;
    public StaffAdministratif() {}
    public StaffAdministratif(Department department, Set<DemandeConger> demandeConger, Set<DemandeStockable> demandeStockable, String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire, Type typeStaff) {
        super(department, demandeConger, demandeStockable, cin, nom, prenom, naissance, sexe, adresse, password, email, telephone, age, DateEmbauche, NbJourCongeTotale, NbJourCongeRestant, Salaire);
        this.typeStaff =typeStaff;
    }


    public Type getTypeStaff() {
        return typeStaff;
    }

    public void setTypeStaff(Type typeStaff) {
        this.typeStaff = typeStaff;
    }
}
//Constructors

//Getters and Setters
