package com.example.demo.Doa;

import com.example.demo.entities.DemandeConger;
import com.example.demo.entities.DemandeStockable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemandeStockableRepository extends JpaRepository<DemandeStockable, Long> {




}