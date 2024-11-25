package com.vaccine.vaccine_management.model;


import jakarta.persistence.*;

@Entity
@Table(name = "centro_vacunacion")
public class CentroVacunacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_centro")
    private  Integer idCentro;

    @Column(name = "centronombre")
    private  String nombrecentro;

    @Column(name = "estado")
    private  Integer estado;

    @Column(name = "direccion")
    private  String direccion;

    @Column(name = "telefono")
    private  String telefono;

    @Column(name = "tipo_vacuna")
    private  String tipo_vacuna;

    @Column(name = "latitud")
    private  Double latitud;

    @Column(name = "longitud")
    private  Double longitud;



    public CentroVacunacion() {
    }


    public CentroVacunacion(Integer idCentro, String nombrecentro, String direccion, String telefono, String tipo_vacuna, Double latitud, Double longitud, Integer estado) {
        this.idCentro = idCentro;
        this.nombrecentro = nombrecentro;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo_vacuna = tipo_vacuna;
        this.latitud = latitud;
        this.longitud = longitud;
        this.estado = estado;
    }


    public Integer getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(Integer idCentro) {
        this.idCentro = idCentro;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public String getTipo_vacuna() {
        return tipo_vacuna;
    }

    public void setTipo_vacuna(String tipo_vacuna) {
        this.tipo_vacuna = tipo_vacuna;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombrecentro() {
        return nombrecentro;
    }

    public void setNombrecentro(String nombrecentro) {
        this.nombrecentro = nombrecentro;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
