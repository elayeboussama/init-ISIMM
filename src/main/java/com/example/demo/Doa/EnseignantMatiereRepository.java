package com.example.demo.Doa;

import com.example.demo.entities.DemandeConger;
import com.example.demo.entities.EnseignantMatiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnseignantMatiereRepository extends JpaRepository<EnseignantMatiere, Long> {




}