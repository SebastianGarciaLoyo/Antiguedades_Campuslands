package com.campusland.proyecto.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contactopersona")
public class ContactoPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    @Column(name = "tipo_contacto", columnDefinition = "ENUM('Teléfono', 'Email')")
    private String tipoContacto;

    @Column(name = "detalle", length = 255)
    private String detalle;

    @ManyToOne
    @JoinColumn(name = "clase_contacto_id")
    private ClaseContacto claseContacto;

    public ContactoPersona() {
    }

    public ContactoPersona(Long id, Persona persona, String tipoContacto, String detalle, ClaseContacto claseContacto) {
        this.id = id;
        this.persona = persona;
        this.tipoContacto = tipoContacto;
        this.detalle = detalle;
        this.claseContacto = claseContacto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(String tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public ClaseContacto getClaseContacto() {
        return claseContacto;
    }

    public void setClaseContacto(ClaseContacto claseContacto) {
        this.claseContacto = claseContacto;
    }
}