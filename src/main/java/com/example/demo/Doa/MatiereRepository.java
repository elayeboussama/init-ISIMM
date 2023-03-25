package com.example.demo.Doa;

import com.example.demo.entities.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {

//    @Query("select m from Matiere m where m.name like :x")
//    public List<Matiere> findByName(@Param("x")String mc);


}