package com.vaccine.vaccine_management.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "citas_medicas")
public class CitaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String tipoVacuna;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaVacunacion;

    @Column(nullable = false)
    private int dosis;

    @Column(nullable = false, length = 255)
    private String sede;

    @Column(nullable = false, length = 50)
    private String estado;

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTipoVacuna() { return tipoVacuna; }
    public void setTipoVacuna(String tipoVacuna) { this.tipoVacuna = tipoVacuna; }

    public Date getFechaVacunacion() { return fechaVacunacion; }
    public void setFechaVacunacion(Date fechaVacunacion) { this.fechaVacunacion = fechaVacunacion; }

    public int getDosis() { return dosis; }
    public void setDosis(int dosis) { this.dosis = dosis; }

    public String getSede() { return sede; }
    public void setSede(String sede) { this.sede = sede; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
