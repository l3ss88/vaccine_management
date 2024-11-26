package com.vaccine.vaccine_management.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "vacunas")
public class Vacuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vacuna")
    private Integer idVacuna;

    @Column(name = "nombre_vacuna", nullable = false, unique = true)
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private Integer dosis_necesarias;

    @Column
    private Integer intervalo_dosis;


    // Constructores, getters y setters
    public Vacuna() {}

    public Vacuna(String nombre_vacuna, String descripcion, Integer dosis_necesarias, Integer intervalo_dosis) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dosis_necesarias = dosis_necesarias;
        this.intervalo_dosis = intervalo_dosis;
    }

    public Integer getId_vacuna() {
        return idVacuna;
    }

    public void setId_vacuna(Integer id_vacuna) {
        this.idVacuna = idVacuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getDosis_necesarias() {
        return dosis_necesarias;
    }

    public void setDosis_necesarias(Integer dosis_necesarias) {
        this.dosis_necesarias = dosis_necesarias;
    }

    public Integer getIntervalo_dosis() {
        return intervalo_dosis;
    }

    public void setIntervalo_dosis(Integer intervalo_dosis) {
        this.intervalo_dosis = intervalo_dosis;
    }


}