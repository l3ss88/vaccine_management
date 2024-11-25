package com.vaccine.vaccine_management.controller;

import com.vaccine.vaccine_management.model.HistorialVacunas;
import com.vaccine.vaccine_management.model.Usuario;
import com.vaccine.vaccine_management.service.HistorialVacunasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/historial-vacunas")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class HistorialVacunasController {
 /*
    @Autowired
    private HistorialVacunasService historialVacunasService;

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<Object> obtenerHistorialPorUsuario(@PathVariable Usuario usuario) {
        List<HistorialVacunas> historial = historialVacunasService.obtenerHistorialPorUsuario(usuario);
        if (historial.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(historial);
    } */
}
