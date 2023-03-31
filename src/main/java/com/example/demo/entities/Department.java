package com.example.demo.entities;

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
public class Department implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_department", nullable = false)
    private Long idDepartment;

    @Column(length = 100)
    private String name;


    private String NonDepartement;

    @OneToOne
    @JoinColumn(name="id_ChefDepartement")
    private Employer ChefDepartement;

    @OneToMany(mappedBy = "department",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<Employer> employers;


    @OneToMany(mappedBy = "department",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<Enseignant> enseignants;

    public Department() {

    }

    public Department(String name) {
        this.name = name;
        this.enseignants  = new HashSet<>();
        this.employers = new HashSet<>();

    }

    public Department(String name, Set<Employer> employers, Set<Enseignant> enseignants ) {
        this.name = name;
        this.employers = employers;
        this.enseignants  = enseignants;
    }

    public Department(String name, Set<Employer> employers  ) {
        this.name = name;
        this.employers = employers;
    }

    public void addEmployer(Employer employer) {
        this.employers.add(employer);

    }

    public void addEnseignant(Enseignant enseignant) {
        this.enseignants.add(enseignant);

    }

}
