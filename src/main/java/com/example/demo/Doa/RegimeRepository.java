package com.example.demo.Doa;

import com.example.demo.entities.Regime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RegimeRepository extends JpaRepository<Regime, Long> {

    @Query("select r from Regime r where r.name like :x")
    public List<Regime> findByName(@Param("x")String mc);


}