package com.vaccine.vaccine_management.controller;


import com.vaccine.vaccine_management.model.CentroVacunacion;
import com.vaccine.vaccine_management.service.CentroVacunacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/centrovacunacion")
public class CentroVacunacionController {

    @Autowired
    private CentroVacunacionService centroVacunacionService;

    @GetMapping  //http:localhost:8090/api/centrovacunacion
    public ResponseEntity<List<CentroVacunacion>> getCentroVacunacion() {

        return ResponseEntity.ok(centroVacunacionService.ObtenerCentroVacunacion());


    }


}
