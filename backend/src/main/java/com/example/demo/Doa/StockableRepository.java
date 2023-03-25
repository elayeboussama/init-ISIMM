package com.example.demo.Doa;

import com.example.demo.entities.Service;
import com.example.demo.entities.Stockable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StockableRepository extends JpaRepository<Stockable, Long> {

//    @Query("select v from Stockable v where v.name like :x")
//    public List<Stockable> findByName(@Param("x")String mc);


}