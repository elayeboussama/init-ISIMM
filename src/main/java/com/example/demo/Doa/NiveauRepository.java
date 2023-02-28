package com.example.demo.Doa;

import com.example.demo.entities.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NiveauRepository extends JpaRepository<Niveau, Long> {

    @Query("select n from Niveau n where n.name like :x")
    public List<Niveau> findByName(@Param("x")String mc);


}