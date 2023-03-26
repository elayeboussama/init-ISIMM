package com.example.demo.Doa;

import com.example.demo.entities.DemandeUnstockable;
import com.example.demo.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {



}