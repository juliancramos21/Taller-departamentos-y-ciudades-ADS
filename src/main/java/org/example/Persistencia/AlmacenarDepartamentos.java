package org.example.Persistencia;
import java.util.ArrayList;
import java.util.List;
import org.example.Modelo.Departamento;

import java.awt.*;

public class AlmacenarDepartamentos implements DatosDepartamento{

    private List<Departamento> departamentos=new ArrayList<>();

    public void agregarDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }

    @Override
    public List<Departamento> obtenerDepartamentos() {
        return new ArrayList<Departamento>(departamentos);
    }

    @Override
    public Departamento buscarDepartamento(String nombre) {
        for(Departamento d : departamentos){
            if(d.getNombre().equalsIgnoreCase(nombre)){
                return d;
            }
        }
        return null;
    }

    @Override
    public void actualizarDepartamento(Departamento departamento, String nombre) {
        Departamento d=buscarDepartamento(nombre);
        if(d!=null){
            departamentos.set(departamentos.indexOf(d), departamento);
        }


    }

    @Override
    public void eliminarDepartamento(String nombre) {
        for(Departamento d : departamentos){
            if(d.getNombre().equalsIgnoreCase(nombre)) {
                departamentos.remove(d);
                break;
            }
        }
    }
}
