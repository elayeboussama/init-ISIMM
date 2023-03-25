package com.example.demo.Doa;

import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Voeux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

//    @Query("select v from Etudiant v where v.name like :x")
//    public List<Etudiant> findByName(@Param("x")String mc);


}