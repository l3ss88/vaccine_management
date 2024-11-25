package com.vaccine.vaccine_management.controller;

import com.vaccine.vaccine_management.model.Vacuna;
import com.vaccine.vaccine_management.service.VacunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vacunas")
public class VacunaController {

    @Autowired
    private VacunaService vacunaService;

    @GetMapping
    public ResponseEntity<List<Vacuna>> obtenerTodasLasVacunas() {
        List<Vacuna> vacunas = vacunaService.obtenerTodasLasVacunas();
        if (vacunas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(vacunas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vacuna> obtenerVacunaPorId(@PathVariable Integer id_vacuna) {
        return vacunaService.obtenerVacunaPorId(id_vacuna)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Vacuna> crearVacuna(@RequestBody Vacuna vacuna) {
        Vacuna nuevaVacuna = vacunaService.guardarVacuna(vacuna);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaVacuna);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarVacuna(@PathVariable Integer id_vacuna) {
        vacunaService.eliminarVacuna(id_vacuna);
        return ResponseEntity.noContent().build();
    }
}
