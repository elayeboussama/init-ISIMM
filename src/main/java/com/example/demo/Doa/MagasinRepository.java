package com.example.demo.Doa;

import com.example.demo.entities.Magasin;
import com.example.demo.entities.Voeux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MagasinRepository extends JpaRepository<Magasin, Long> {

//    @Query("select v from Magasin v where v.name like :x")
//    public List<Magasin> findByName(@Param("x")String mc);


}