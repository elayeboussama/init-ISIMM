package com.example.demo.Doa;

import com.example.demo.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SectionRepository extends JpaRepository<Section, Long> {

    @Query("select s from Section s where s.name like :x")
    public List<Section> findByName(@Param("x")String mc);


}