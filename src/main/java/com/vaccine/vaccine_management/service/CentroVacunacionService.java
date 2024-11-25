package com.vaccine.vaccine_management.service;

import com.vaccine.vaccine_management.model.CentroVacunacion;
import com.vaccine.vaccine_management.repository.CentroVacunacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CentroVacunacionService {

    @Autowired
    private CentroVacunacionRepository CentroVacunacionRepository;

    public List<CentroVacunacion> ObtenerCentroVacunacion() {

        return CentroVacunacionRepository.findAll();



    }


}
