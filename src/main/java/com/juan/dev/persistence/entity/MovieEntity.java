package com.juan.dev.persistence.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "plataforma_pelicula")
@JsonPropertyOrder({ "id", "titulo", "director", "calificacion", "duracion", "genero", "fechaEstresno", "estado", "descripcion" })
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 150)
    private String titulo;
    @Column(nullable = false, length = 250)
    private String descripcion;
    @Column(name = "fecha_estreno", nullable = false)
    private LocalDate fechaEstreno;
    @Column(nullable = false, length = 40)
    private String director;
    @Column(nullable = false, precision = 3)
    private Integer duracion;
    @Column(nullable = false, length = 40)
    private String genero;
    @Column(nullable = false, precision = 3, scale = 2)
    private BigDecimal calificacion;
    @Column(nullable = false, length= 1)
    private String estado;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {this.fechaEstreno = fechaEstreno;}

    public String getDirector() {return director;}

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public BigDecimal getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(BigDecimal calificacion) {this.calificacion = calificacion;}

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
