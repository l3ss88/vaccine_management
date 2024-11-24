package com.vaccine.vaccine_management.model;

import jakarta.persistence.*;
import org.hibernate.mapping.List;

@Entity
@Table(name = "vacunas")
public class Vacuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vacuna")
    private Integer id_vacuna;

    @Column(nullable = false)
    private String nombre_vacuna;

    @Column
    private String descripcion;

    @Column
    private Integer dosis_necesarias;

    @Column
    private Integer intervalo_dosis;


    @OneToMany(mappedBy = "vacuna", cascade = CascadeType.ALL, orphanRemoval = true)
    private List historiales;

    // Constructores, getters y setters
    public Vacuna() {}

    public Vacuna(String nombre_vacuna, String descripcion, Integer dosis_necesarias) {
        this.nombre_vacuna = nombre_vacuna;
        this.descripcion = descripcion;
        this.dosis_necesarias = dosis_necesarias;
        this.intervalo_dosis = intervalo_dosis;
    }

    public Integer getId_vacuna() {
        return id_vacuna;
    }

    public void setId_vacuna(Integer id_vacuna) {
        this.id_vacuna = id_vacuna;
    }

    public String getNombre_vacuna() {
        return nombre_vacuna;
    }

    public void setNombre_vacuna(String nombre_vacuna) {
        this.nombre_vacuna = nombre_vacuna;
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

    public List getHistoriales() {
        return historiales;
    }

    public void setHistoriales(List historiales) {
        this.historiales = historiales;
    }
}
