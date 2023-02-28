package com.example.demo.Doa;

import com.example.demo.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {

    @Query("select e from Enseignant e where e.name like :x")
    public List<Enseignant> findByName(@Param("x")String mc);


}