package org.example.Persistencia;

import org.example.Modelo.Departamento;

import java.util.List;
public interface DatosDepartamento {
    void agregarDepartamento(Departamento departamento);
    List<Departamento> obtenerDepartamentos();
    Departamento buscarDepartamento(String nombre);
    void actualizarDepartamento(Departamento departamento, String nombre);
    void eliminarDepartamento(String nombre);
}
