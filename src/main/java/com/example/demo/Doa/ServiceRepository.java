package com.example.demo.Doa;

import com.example.demo.entities.Service;
import com.example.demo.entities.Voeux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, Long> {

    @Query("select v from Service v where v.name like :x")
    public List<Service> findByName(@Param("x")String mc);


}