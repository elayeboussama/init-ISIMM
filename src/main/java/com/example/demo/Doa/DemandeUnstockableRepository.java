package com.example.demo.Doa;

import com.example.demo.entities.DemandeStockable;
import com.example.demo.entities.DemandeUnstockable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DemandeUnstockableRepository extends JpaRepository<DemandeUnstockable, Long> {

//    @Query("select v from DemandeUnstockable v where v.name like :x")
//    public List<DemandeUnstockable> findByName(@Param("x")String mc);


}