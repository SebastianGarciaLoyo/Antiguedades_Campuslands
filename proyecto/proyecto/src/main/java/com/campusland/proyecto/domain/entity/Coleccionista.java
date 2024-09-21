package com.campusland.proyecto.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "coleccionistas")
public class Coleccionista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    @Column(name = "nivel_coleccionista")
    private String nivelColeccionista;

    public Coleccionista() {
    }

    public Coleccionista(Long id, Persona persona, String nivelColeccionista) {
        this.id = id;
        this.persona = persona;
        this.nivelColeccionista = nivelColeccionista;
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

    public String getNivelColeccionista() {
        return nivelColeccionista;
    }

    public void setNivelColeccionista(String nivelColeccionista) {
        this.nivelColeccionista = nivelColeccionista;
    }
}
