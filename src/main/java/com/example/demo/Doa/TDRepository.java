package com.example.demo.Doa;

import com.example.demo.entities.TD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TDRepository extends JpaRepository<TD, Long> {

//    @Query("select t from TD t where t.name like :x")
//    public List<TD> findByName(@Param("x")String mc);


}