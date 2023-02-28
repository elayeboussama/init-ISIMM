package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Employer   implements Serializable {
    @Id
    @GeneratedValue
    private Long idEmployer;
    @Column(length = 100)
    private String name;
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="department")
    private Department department;

    @OneToMany(mappedBy = "employer",fetch=FetchType.LAZY)
    private Set<DemandeConger> demandeConger;

    public Employer(  Department department, Set<DemandeConger> demandeConger) {

        this.department = department;
        this.demandeConger = demandeConger;
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
}
