package com.example.demo.Doa;

import com.example.demo.entities.Reclamation;
import com.example.demo.entities.Voeux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReclamationRepository extends JpaRepository<Reclamation, Long> {

    @Query("select v from Reclamation v where v.name like :x")
    public List<Reclamation> findByName(@Param("x")String mc);


}