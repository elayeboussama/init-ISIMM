package com.example.demo.Doa;

import com.example.demo.entities.Emploi;
import com.example.demo.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleRepository extends JpaRepository<Salle, Long> {




}