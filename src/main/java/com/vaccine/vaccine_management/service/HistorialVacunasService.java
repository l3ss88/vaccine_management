package com.vaccine.vaccine_management.service;

import com.vaccine.vaccine_management.model.HistorialVacunas;
import com.vaccine.vaccine_management.repository.HistorialVacunasRepository;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistorialVacunasService {

    @Autowired
    private HistorialVacunasRepository historialVacunasRepository;

    public List<HistorialVacunas> obtenerHistorialPorUsuario(Usuario usuario) {
        return historialVacunasRepository.findByUsuario(usuario);
    }
}
