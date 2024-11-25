package com.vaccine.vaccine_management.controller;

import com.vaccine.vaccine_management.model.CitaMedica;
import com.vaccine.vaccine_management.service.CitaMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/citas")
public class CitaMedicaController {

    @Autowired
    private CitaMedicaService citaMedicaService;

    @PostMapping("/registrar") //http://localhost:8090/api/citas/registrar enviar el registro en formato json
    public ResponseEntity<CitaMedica> registrarCita(@RequestBody CitaMedica cita) {
        CitaMedica nuevaCita = citaMedicaService.registrarCita(cita);
        return ResponseEntity.ok(nuevaCita);
    }

    @GetMapping
    public ResponseEntity<List<CitaMedica>> obtenerCitas() {
        return ResponseEntity.ok(citaMedicaService.obtenerCitas());
    }
}
