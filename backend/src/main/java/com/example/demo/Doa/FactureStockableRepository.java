package com.example.demo.Doa;

import com.example.demo.entities.Facture;
import com.example.demo.entities.FactureStockable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FactureStockableRepository extends JpaRepository<FactureStockable, Long> {

//    @Query("select v from FactureStockable v where v.name like :x")
//    public List<FactureStockable> findByName(@Param("x")String mc);


}