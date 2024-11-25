package com.vaccine.vaccine_management.repository;

import com.vaccine.vaccine_management.model.CentroVacunacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CentroVacunacionRepository extends JpaRepository <CentroVacunacion, Integer>   {
  List<CentroVacunacion> findByLatitud (Double id);

}
