package com.vaccine.vaccine_management.service;

import com.vaccine.vaccine_management.model.CitaMedica;
import com.vaccine.vaccine_management.repository.CitaMedicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaMedicaService {

    @Autowired
    private CitaMedicaRepository citaMedicaRepository;

    public CitaMedica registrarCita(CitaMedica cita) {
        return citaMedicaRepository.save(cita);
    }

    public List<CitaMedica> obtenerCitas() {
        return citaMedicaRepository.findAll();
    }
}
