package org.example.Controladores;
import java.util.ArrayList;
import java.util.List;
import org.example.Modelo.Departamento;
import org.example.Persistencia.AlmacenarDepartamentos;
import org.example.Persistencia.DatosDepartamento;

public class ControladorDepartamento {
    private DatosDepartamento dao= new AlmacenarDepartamentos();

    public void agregarDepartamento(Departamento d){
        dao.agregarDepartamento(d);
    }
    public List<Departamento> getDepartamentos(){
        return dao.obtenerDepartamentos();
    }
    public Departamento buscarDepartamento(String nombre){
        return dao.buscarDepartamento(nombre);
    }
    public void actualizarDepartamento(Departamento d, String nombre){
        dao.actualizarDepartamento(d, nombre);
    }
    public void eliminarDepartamento(String nombre){
        dao.eliminarDepartamento(nombre);
    }
}
