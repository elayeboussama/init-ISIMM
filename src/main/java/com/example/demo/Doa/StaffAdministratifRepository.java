package com.example.demo.Doa;

import com.example.demo.entities.StaffAdministratif;
import com.example.demo.entities.Voeux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StaffAdministratifRepository extends JpaRepository<StaffAdministratif, Long> {

//    @Query("select v from StaffAdministratif v where v.name like :x")
//    public List<StaffAdministratif> findByName(@Param("x")String mc);


}