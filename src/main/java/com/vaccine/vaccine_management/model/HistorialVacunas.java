package com.vaccine.vaccine_management.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "historial_vacunas")
public class HistorialVacunas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historial")
    private Integer id_historial;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_vacuna", nullable = false)
    private Vacuna vacuna;

    @Column(nullable = false)
    private LocalDate fecha_aplicacion;

    @Column(nullable = false)
    private Integer dosis_numero;


    @Column(nullable = false)
    private Integer id_personal_salud;

    public Integer getId_historial() {
        return id_historial;
    }

    public void setId_historial(Integer id_historial) {
        this.id_historial = id_historial;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vacuna getVacuna() {
        return vacuna;
    }

    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
    }

    public LocalDate getFecha_aplicacion() {
        return fecha_aplicacion;
    }

    public void setFecha_aplicacion(LocalDate fecha_aplicacion) {
        this.fecha_aplicacion = fecha_aplicacion;
    }

    public Integer getDosis_numero() {
        return dosis_numero;
    }

    public void setDosis_numero(Integer dosis_numero) {
        this.dosis_numero = dosis_numero;
    }

    public Integer getId_personal_salud() {
        return id_personal_salud;
    }

    public void setId_personal_salud(Integer id_personal_salud) {
        this.id_personal_salud = id_personal_salud;
    }
}