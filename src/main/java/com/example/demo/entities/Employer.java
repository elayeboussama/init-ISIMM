package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employer  extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_employer", nullable = false)
    private Long idEmployer;

    @Column(length = 100)
    private String name;
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="department")
    private Department department;

    @OneToMany(mappedBy = "employer",fetch=FetchType.LAZY)
    private Set<DemandeConger> demandeConger;

    @OneToMany(mappedBy = "employer",fetch=FetchType.LAZY)
    private Set<DemandeStockable> demandeStockable;

    public Long getIdEmployer() {
        return idEmployer;
    }

    public void setIdEmployer(Long idEmployer) {
        this.idEmployer = idEmployer;
    }

    public Employer(  Department department, Set<DemandeConger> demandeConger, Set<DemandeStockable> demandeStockable, String name, String prenom, int age, String adresse) {
        super(name, prenom, age, adresse);
        this.department = department;
        this.demandeConger = demandeConger;
        this.demandeStockable = demandeStockable;
    }

    public Employer() {
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set<DemandeConger> getDemandeConger() {
        return demandeConger;
    }

    public void setDemandeConger(Set<DemandeConger> demandeConger) {
        this.demandeConger = demandeConger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<DemandeStockable> getDemandeStockable() {
        return demandeStockable;
    }

    public void setDemandeStockable(Set<DemandeStockable> demandeStockable) {
        this.demandeStockable = demandeStockable;
    }
}
