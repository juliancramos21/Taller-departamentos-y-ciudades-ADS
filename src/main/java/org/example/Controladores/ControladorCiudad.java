package org.example.Controladores;

import org.example.Modelo.Ciudad;
import org.example.Persistencia.AlmacenarCiudades;
import org.example.Persistencia.DatosCiudad;

import java.util.List;

public class ControladorCiudad {
    private DatosCiudad cao= new AlmacenarCiudades();

    public void agregarCiudad(Ciudad c){
        cao.agregarCiudad(c);
    }
    public List<Ciudad> getCiudades(){
        return cao.obtenerCiudades();
    }
    public Ciudad buscarCiudad(String nombre){
        return cao.buscarCiudad(nombre);
    }
    public void actualizarCiudad(Ciudad c, String nombre){
        cao.actualizarCiudad(c, nombre);
    }
    public void eliminarCiudad(String nombre){
        cao.eliminarCiudad(nombre);
    }
}
