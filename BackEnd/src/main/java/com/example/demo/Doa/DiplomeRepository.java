package com.example.demo.Doa;

import com.example.demo.entities.Diplome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DiplomeRepository extends JpaRepository<Diplome, Long> {

//    @Query("select d from Diplome d where d.name like :x")
//    public List<Diplome> findByName(@Param("x")String mc);


}