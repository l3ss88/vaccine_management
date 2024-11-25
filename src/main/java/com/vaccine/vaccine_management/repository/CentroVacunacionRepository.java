package com.vaccine.vaccine_management.repository;

import com.vaccine.vaccine_management.model.CentroVacunacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CentroVacunacionRepository extends JpaRepository <CentroVacunacion, Integer>   {
  List<CentroVacunacion> findByLatitud (Double id);

  @Query("SELECT p From CentroVacunacion p WHERE p.nombrecentro like %:nombrecentro%")
  public List<CentroVacunacion> obtenernombrecentroDescripcion(@Param("nombrecentro") String nombrecentro);


  @Query("SELECT p From CentroVacunacion p WHERE p.estado = :estado")
  public List<CentroVacunacion> obtenernombrecentroEstado(@Param("estado") Integer estado);


}
