package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Department implements Serializable {

    @Id
    @GeneratedValue
    private Long idDepartment;

    @Column(length = 100)
    private String name;

    @OneToMany(mappedBy = "department",fetch=FetchType.LAZY)
    private Set<Employer> employers;


    @OneToMany(mappedBy = "department",fetch=FetchType.LAZY)
    private Set<Enseignant> enseignants;

    public Department() {

    }

    public Department(String name, Set<Employer> employers ) {
        this.name = name;
        this.employers = employers;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(Set<Employer> employers) {
        this.employers = employers;
    }

}
//Constructors

//Getters and Setters
