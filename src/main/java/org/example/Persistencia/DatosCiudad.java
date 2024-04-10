package org.example.Persistencia;

import org.example.Modelo.Ciudad;
import java.util.List;

public interface DatosCiudad {
    void agregarCiudad(Ciudad ciudad);
    List<Ciudad> obtenerCiudades();
    Ciudad buscarCiudad(String nombre);
    void actualizarCiudad(Ciudad ciudad, String nombre);
    void eliminarCiudad(String nombre);
}
