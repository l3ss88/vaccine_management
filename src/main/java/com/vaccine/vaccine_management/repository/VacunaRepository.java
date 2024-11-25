package com.vaccine.vaccine_management.repository;

import com.vaccine.vaccine_management.model.Vacuna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VacunaRepository extends JpaRepository<Vacuna, Integer> {
    Optional<Vacuna> findByNombre(String nombre);

}
