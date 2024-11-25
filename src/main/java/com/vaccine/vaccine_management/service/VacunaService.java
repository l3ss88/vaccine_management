package com.vaccine.vaccine_management.service;

import com.vaccine.vaccine_management.model.Vacuna;
import com.vaccine.vaccine_management.repository.VacunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VacunaService {

    @Autowired
    private VacunaRepository vacunaRepository;

    public List<Vacuna> obtenerTodasLasVacunas() {
        return vacunaRepository.findAll();
    }

    public Optional<Vacuna> obtenerVacunaPorIdVacuna(Integer idVacuna) {
        return vacunaRepository.findById(idVacuna);
    }

    public Vacuna guardarVacuna(Vacuna vacuna) {
        return vacunaRepository.save(vacuna);
    }

    public void eliminarVacuna(Integer idVacuna) {
        vacunaRepository.deleteById(idVacuna);
    }
}