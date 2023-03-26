package com.example.demo.Doa;

import com.example.demo.entities.Enseignant;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@Transactional

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {

    @Query("SELECT s FROM Enseignant s where  s.email=?1")
    Optional<Enseignant> chargeFindEnseignantByEmail(String email);
    Optional<Enseignant> chargeFindEnseignantByCin(String cin);


}