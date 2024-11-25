package com.vaccine.vaccine_management.repository;

import com.vaccine.vaccine_management.model.HistorialVacunas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistorialVacunasRepository extends JpaRepository<HistorialVacunas, Integer> {
    List<HistorialVacunas> findByUsuarioId(Integer usuarioId);
}
