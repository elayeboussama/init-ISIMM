package com.example.demo.Doa;

import com.example.demo.entities.TP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TPRepository extends JpaRepository<TP, Long> {

//    @Query("select t from TP t where t.name like :x")
//    public List<TP> findByName(@Param("x")String mc);


}