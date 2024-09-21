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
@Table(name = "antiguedades")
public class Antiguedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "epoca_id")
    private EpocaAntiguedad epoca;

    @Column(name = "valor", columnDefinition = "DECIMAL(10, 2)")
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "ranking_antiguedad_id")
    private RankingAntiguedad rankingAntiguedad;

    public Antiguedad() {
    }

    public Antiguedad(Long id, String nombre, String descripcion, Categoria categoria, EpocaAntiguedad epoca, Double valor, RankingAntiguedad rankingAntiguedad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.epoca = epoca;
        this.valor = valor;
        this.rankingAntiguedad = rankingAntiguedad;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public EpocaAntiguedad getEpoca() {
        return epoca;
    }

    public void setEpoca(EpocaAntiguedad epoca) {
        this.epoca = epoca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public RankingAntiguedad getRankingAntiguedad() {
        return rankingAntiguedad;
    }

    public void setRankingAntiguedad(RankingAntiguedad rankingAntiguedad) {
        this.rankingAntiguedad = rankingAntiguedad;
    }
}