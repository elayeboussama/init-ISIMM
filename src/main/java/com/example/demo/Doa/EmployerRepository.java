package com.example.demo.Doa;

import com.example.demo.entities.Employer;
import com.example.demo.entities.Voeux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployerRepository extends JpaRepository<Employer, Long> {

    @Query("select v from Employer v where v.name like :x")
    public List<Employer> findByName(@Param("x")String mc);


}