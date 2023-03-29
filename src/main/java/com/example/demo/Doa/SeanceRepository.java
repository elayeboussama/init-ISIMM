package com.example.demo.Doa;

import com.example.demo.entities.Salle;
import com.example.demo.entities.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeanceRepository extends JpaRepository<Seance, Long> {




}