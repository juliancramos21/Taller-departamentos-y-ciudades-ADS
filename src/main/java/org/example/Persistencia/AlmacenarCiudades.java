package org.example.Persistencia;

import org.example.Modelo.Ciudad;
import java.util.ArrayList;
import java.util.List;

public class AlmacenarCiudades implements DatosCiudad{
    private List<Ciudad> ciudades=new ArrayList<>();

    public void agregarCiudad(Ciudad ciudad){
        ciudades.add(ciudad);
    }

    @Override
    public List<Ciudad> obtenerCiudades() {
        return new ArrayList<Ciudad>(ciudades);
    }

    @Override
    public Ciudad buscarCiudad(String nombre) {
        for(Ciudad d : ciudades){
            if(d.getNombre().equalsIgnoreCase(nombre)){
                return d;
            }
        }
        return null;
    }

    @Override
    public void actualizarCiudad(Ciudad ciudad, String nombre) {
        Ciudad d=buscarCiudad(nombre);
        if(d!=null){
            ciudades.set(ciudades.indexOf(d), ciudad);
        }


    }

    @Override
    public void eliminarCiudad(String nombre) {
        for(Ciudad d : ciudades){
            if(d.getNombre().equalsIgnoreCase(nombre)) {
                ciudades.remove(d);
                break;
            }
        }
    }
}
