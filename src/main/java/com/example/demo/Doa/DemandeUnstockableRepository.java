package com.example.demo.Doa;


import com.example.demo.entities.DemandeUnStockable;
import org.springframework.data.jpa.repository.JpaRepository ;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DemandeUnstockableRepository extends JpaRepository<DemandeUnStockable, Long> {


}