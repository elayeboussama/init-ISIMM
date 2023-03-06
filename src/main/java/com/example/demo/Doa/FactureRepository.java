package com.example.demo.Doa;

import com.example.demo.entities.DemandeUnstockable;
import com.example.demo.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture, Long> {

    @Query("select v from Facture v where v.name like :x")
    public List<Facture> findByName(@Param("x")String mc);


}