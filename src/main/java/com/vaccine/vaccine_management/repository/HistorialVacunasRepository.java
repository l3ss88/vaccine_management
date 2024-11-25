package com.vaccine.vaccine_management.repository;

import com.vaccine.vaccine_management.model.HistorialVacunas;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialVacunasRepository extends JpaRepository<HistorialVacunas, Long > {
    List<HistorialVacunas> findByUsuario(Usuario usuario);
}
