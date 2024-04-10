package org.example.Modelo;

public class Ciudad {
    private String nombre;
    private String pais;
    private int poblacion;
    private String descripcion;

    public Ciudad(String nombre, String pais, int poblacion, String descripcion) {
        this.nombre = nombre;
        this.pais = pais;
        this.poblacion = poblacion;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", poblacion=" + poblacion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
