package com.vaccine.vaccine_management.repository;

import com.vaccine.vaccine_management.model.CitaMedica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaMedicaRepository extends JpaRepository<CitaMedica, Integer> {
}
