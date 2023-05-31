//package com.example.demo.entities;
//
//import com.example.demo.entities.enums.Sexe;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.io.Serializable;
//import java.util.Collection;
//import java.util.Date;
//
//
//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Getter
//@Setter
//public class Personne implements UserDetails {
//    @Id
//    @GeneratedValue
//    @Column(name = "id", nullable = false)
//    private Long id;
//
//    @Column(length = 100)
//    private String cin;
//    @Column(length = 100)
//    private String nom;
//    @Column(length = 100)
//    private String prenom;
//
//    @Column
//    private Date naissance;
//
//    @Enumerated(EnumType.STRING)
//    @Column
//    private Sexe sexe;
//    @Column(length = 500)
//    private String adresse ;
//    @Column(length = 100)
//    private String password;
//    @Column(length = 100)
//    private String email;
//    @Column(length = 100)
//    private String telephone;
//    @Column
//    private int age;
//
//    public Personne() {
//
//    }
//    public Personne(String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age) {
//        this.cin = cin;
//        this.nom = nom;
//        this.prenom = prenom;
//        this.naissance = naissance;
//        this.sexe = sexe;
//        this.adresse = adresse;
//        this.password = password;
//        this.email = email;
//        this.telephone = telephone;
//        this.age = age;
//    }
//
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public String getUsername() {
//        return null;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return false;
//    }
//}


package com.example.demo.entities;

import com.example.demo.entities.enums.Sexe;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
public class Personne implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(length = 100)
    private String cin;
    @Column(length = 100)
    private String nom;
    @Column(length = 100)
    private String prenom;

    @Column
    private Date naissance;

    @Enumerated(EnumType.STRING)
    @Column
    private Sexe sexe;
    @Column(length = 500)
    private String adresse ;
    @Column(length = 100)
    private String password;
    @Column(length = 100)
    private String email;
    @Column(length = 100)
    private String telephone;
    @Column
    private int age;

    public Personne() {

    }
    public Personne(String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
        this.sexe = sexe;
        this.adresse = adresse;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
    }

    public Personne(  String nom ) {

        this.nom = nom;

    }

}
