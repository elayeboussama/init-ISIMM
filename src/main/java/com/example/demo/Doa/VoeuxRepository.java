package com.example.demo.Doa;

import com.example.demo.entities.Voeux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VoeuxRepository extends JpaRepository<Voeux, Long> {

//    @Query("select v from Voeux v where v.name like :x")
//    public List<Voeux> findByName(@Param("x")String mc);


}