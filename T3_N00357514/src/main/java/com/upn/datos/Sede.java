package com.upn.datos;

import jakarta.persistence.*;

@Entity
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ciudad;

    @Column(name = "poblacion_estudiantes")
    private int poblacionEstudiantes;

    @ManyToOne
    @JoinColumn(name = "universidad_id")
    private Universidad universidad;

    public int getPoblacionEstudiantes() {
        return poblacionEstudiantes;
    }

    public void setPoblacionEstudiantes(int poblacionEstudiantes) {
        this.poblacionEstudiantes = poblacionEstudiantes;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // toString (opcional)
    @Override
    public String toString() {
        return "Sede{" +
                "id=" + id +
                ", ciudad='" + ciudad + '\'' +
                ", poblacionEstudiantes=" + poblacionEstudiantes +
                '}';
    }
}
