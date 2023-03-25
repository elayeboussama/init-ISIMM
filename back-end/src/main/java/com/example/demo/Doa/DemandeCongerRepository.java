package com.example.demo.Doa;

import com.example.demo.entities.DemandeConger;
import com.example.demo.entities.Voeux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DemandeCongerRepository extends JpaRepository<DemandeConger, Long> {

//    @Query("select v from DemandeConger v where v.nom like :x")
//    public List<DemandeConger> findByName(@Param("x")String mc);


}