package com.example.demo.Doa;

import com.example.demo.entities.Employer;
import com.example.demo.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {

//    @Query("select v from Fournisseur v where v.name like :x")
//    public List<Fournisseur> findByName(@Param("x")String mc);


}