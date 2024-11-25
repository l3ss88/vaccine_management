package com.vaccine.vaccine_management.controller;


import com.vaccine.vaccine_management.model.CentroVacunacion;
import com.vaccine.vaccine_management.service.CentroVacunacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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


    @GetMapping("/filtrarporestado/{estado}") //http:localhost:8090/api/centrovacunacion/filtrarporestado/
    public ResponseEntity<List<CentroVacunacion>> centrovacunaEstado(
            @PathVariable(value = "estado") String estado
    ){
        int estadofiltro = 0;

        if (estado == "Activo"){
            estadofiltro = 1;
        }
        else if (estado == "Inactivo"){
            estadofiltro = 0;
        }

        return ResponseEntity.ok(centroVacunacionService.ObtenerCentroVacunacionPorEstado(estadofiltro));
    }


    @GetMapping("/filtrarporestado/{centro}") //http:localhost:8090/api/centrovacunacion/filtrarporestado/
    public ResponseEntity<List<CentroVacunacion>> centrovacunaPrefijo(
            @PathVariable(value = "centro") String centro
    ){

        return ResponseEntity.ok(centroVacunacionService.ObtenerCentroVacunacionPorDesc(centro));
    }


}
