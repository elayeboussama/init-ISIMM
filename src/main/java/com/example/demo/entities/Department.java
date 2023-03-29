package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
public class Department implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_department", nullable = false)
    private Long idDepartment;

    @Column(length = 100)
    private String name;


    private String NonDepartement;

    @OneToOne
    private Employer ChefDepartement;

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

    public void addEmployer(Employer employer) {
        this.employers.add(employer);

    }
}
