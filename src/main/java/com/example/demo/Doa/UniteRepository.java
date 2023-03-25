package com.example.demo.Doa;

import com.example.demo.entities.Unite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UniteRepository extends JpaRepository<Unite, Long> {

//    @Query("select u from Unite u where u.name like :x")
//    public List<Unite> findByName(@Param("x")String mc);


}