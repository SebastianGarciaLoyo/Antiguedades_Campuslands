package com.campusland.proyecto.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "rubro", length = 100)
    private String rubro;

    @Column(name = "fecha_fundacion")
    private java.sql.Date fechaFundacion;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    public Empresa() {
    }

    public Empresa(Long id, String nombre, String rubro, java.sql.Date fechaFundacion, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.rubro = rubro;
        this.fechaFundacion = fechaFundacion;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public java.sql.Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(java.sql.Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
