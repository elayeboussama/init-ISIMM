package com.example.demo.Doa;

import com.example.demo.entities.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SemestreRepository extends JpaRepository<Semestre, Long> {

    @Query("select s from Semestre s where s.name like :x")
    public List<Semestre> findByName(@Param("x")String mc);


}