package com.vaccine.vaccine_management.service;



import com.vaccine.vaccine_management.model.HistorialVacunas;
import com.vaccine.vaccine_management.model.Usuario;
import com.vaccine.vaccine_management.repository.HistorialVacunasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HistorialVacunasService {

    @Autowired
    private HistorialVacunasRepository historialVacunasRepository;

    public List<HistorialVacunas> obtenerHistorialPorUsuario(Usuario usuario) {
        return historialVacunasRepository.findByUsuario(usuario);
    }
}