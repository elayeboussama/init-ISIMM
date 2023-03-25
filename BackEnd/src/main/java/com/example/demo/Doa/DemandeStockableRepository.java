package com.example.demo.Doa;

import com.example.demo.entities.DemandeConger;
import com.example.demo.entities.DemandeStockable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DemandeStockableRepository extends JpaRepository<DemandeStockable, Long> {

//    @Query("select v from DemandeStockable v where v.name like :x")
//    public List<DemandeStockable> findByName(@Param("x")String mc);


}