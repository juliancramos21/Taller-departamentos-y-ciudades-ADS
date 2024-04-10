package org.example.Presentacion;
import org.example.Controladores.ControladorDepartamento;
import org.example.Controladores.ControladorCiudad;

import org.example.Modelo.Ciudad;
import org.example.Modelo.Departamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        ControladorDepartamento controladorDepartamento = new ControladorDepartamento();
        ControladorCiudad controladorCiudad = new ControladorCiudad();
        String nombre, capital, descripcion, pais;
        int poblacion, opcion=0;
        List<Departamento> departamentos=new ArrayList<>();
        List<Ciudad> ciudades=new ArrayList<>();
        menuPrincipal:
        while(opcion!=3) {
            System.out.println("Ingrese la opcion que desea visualizar");
            System.out.println("1.Realizar operaciones CRUD para departamentos");
            System.out.println("2.Realizar operaciones CRUD para ciudades");
            System.out.println("3. Salir del programa");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Eligió departamentos, qué desea hacer");
                    while(true){
                        System.out.println(("1. Agregar departamento"));
                        System.out.println("2. Eliminar departamento");
                        System.out.println("3. Mostrar todos los departamentos actuales");
                        System.out.println("4. Actualizar departamento");
                        System.out.println("5.Buscar departamento");
                        System.out.println("6. Volver al menú principal");
                        opcion = entrada.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("Ingrese el nombre del departamento");
                                nombre = entrada.next();
                                System.out.println("Ingrese la capital del departamento");
                                capital = entrada.next();
                                System.out.println("Ingrese la poblacion del departamento");
                                poblacion = entrada.nextInt();
                                System.out.println("Ingrese el descripcion del departamento");
                                descripcion = entrada.next();
                                Departamento departamento = new Departamento(nombre, capital,poblacion,descripcion);
                                controladorDepartamento.agregarDepartamento(departamento);
                                break;
                            case 2:
                                System.out.println("Ingrese el nombre del departamento");
                                nombre = entrada.next();
                                if(controladorDepartamento.buscarDepartamento(nombre) != null){
                                    System.out.println("Se elimino el departamento: "+ controladorDepartamento.buscarDepartamento(nombre));
                                    controladorDepartamento.eliminarDepartamento(nombre);
                                }else{
                                    System.out.println("El departamento no existe");
                                }
                                break;
                            case 3:
                                if(!controladorDepartamento.getDepartamentos().isEmpty()){
                                    System.out.println("Los departamenos actuales son: ");
                                    System.out.println(controladorDepartamento.getDepartamentos());
                                }else{
                                    System.out.println("Actualmente la lista de departamentos está vacía");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el nombre del departamento a modificar");
                                String nombreModificar = entrada.next();
                                if(controladorDepartamento.buscarDepartamento(nombreModificar) != null){
                                    System.out.println("Ingrese el nuevo nombre del departamento ");
                                    nombre = entrada.next();
                                    System.out.println("Ingrese la nueva capital del departamento");
                                    capital = entrada.next();
                                    System.out.println("Ingrese la nueva poblacion del departamento");
                                    poblacion = entrada.nextInt();
                                    System.out.println("Ingrese la nueva descripcion del departamento");
                                    descripcion = entrada.next();
                                    System.out.println("El departamento antes de actualizar era: "+ controladorDepartamento.buscarDepartamento(nombreModificar));
                                    Departamento d = new Departamento(nombre, capital,poblacion,descripcion);
                                    System.out.println("El departamento actualizado es: "+ d);
                                    controladorDepartamento.actualizarDepartamento(d, nombreModificar);
                                }else{
                                    System.out.println("El departamento no existe");
                                }
                                break;
                            case 5:
                                System.out.println("Ingrese el nombre del departamento");
                                nombre = entrada.next();
                                if(controladorDepartamento.buscarDepartamento(nombre) != null){
                                    departamento=controladorDepartamento.buscarDepartamento(nombre);
                                    System.out.println("El departamento es: "+departamento);
                                }else{
                                    System.out.println("El departamento no existe");
                                }
                                break;
                            case 6:
                                System.out.println("Volviendo al menú principal...");
                                continue menuPrincipal;
                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;
                        }
                    }

                case 2:
                    while(true){
                        System.out.println("Eligió ciudades, qué desea hacer");
                        System.out.println(("1. Agregar ciudad"));
                        System.out.println("2. Eliminar ciudad");
                        System.out.println("3. Mostrar todas las ciudades actuales");
                        System.out.println("4. Actualizar ciudad");
                        System.out.println("5.Buscar ciudad");
                        System.out.println("6. Volver al menú principal");
                        opcion = entrada.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("Ingrese el nombre de la ciudad");
                                nombre = entrada.next();
                                System.out.println("Ingrese el pais de la ciudad");
                                pais = entrada.next();
                                System.out.println("Ingrese la poblacion de la ciudad");
                                poblacion = entrada.nextInt();
                                System.out.println("Ingrese la descripcion de la ciudad");
                                descripcion = entrada.next();
                                Ciudad ciudad = new Ciudad(nombre, pais,poblacion,descripcion);
                                controladorCiudad.agregarCiudad(ciudad);
                                break;
                            case 2:
                                System.out.println("Ingrese el nombre de la ciudad");
                                nombre = entrada.next();
                                if(controladorCiudad.buscarCiudad(nombre) != null){
                                System.out.println("Se elimino la ciudad: "+ controladorCiudad.buscarCiudad(nombre));
                                controladorCiudad.eliminarCiudad(nombre);
                                }else{
                                    System.out.println("La ciudad no existe");
                                }
                                break;
                            case 3:
                                if(!controladorCiudad.getCiudades().isEmpty()){
                                    System.out.println("Las ciudades actuales son: ");
                                    System.out.println(controladorCiudad.getCiudades());
                                }else{
                                    System.out.println("Actualmente la lista de ciudades está vacía");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el nombre de la ciudad a modificar");
                                String nombreModificar = entrada.next();
                                if(controladorCiudad.buscarCiudad(nombreModificar) != null){
                                    System.out.println("Ingrese el nuevo nombre de la ciudad ");
                                    nombre = entrada.next();
                                    System.out.println("Ingrese el nuevo pais de la ciudad");
                                    pais = entrada.next();
                                    System.out.println("Ingrese la nueva poblacion de la ciudad");
                                    poblacion = entrada.nextInt();
                                    System.out.println("Ingrese la nueva descripcion de la ciudad");
                                    descripcion = entrada.next();
                                    System.out.println("La ciudad antes de actualizar era: "+ controladorCiudad.buscarCiudad(nombreModificar));
                                    Ciudad c = new Ciudad(nombre, pais,poblacion,descripcion);
                                    System.out.println("La ciudad actualizada es: "+ c);
                                    controladorCiudad.actualizarCiudad(c, nombreModificar);
                                }else{
                                    System.out.println("La ciudad no existe");
                                }

                                break;
                            case 5:
                                System.out.println("Ingrese el nombre de la ciudad");
                                nombre = entrada.next();
                                if(controladorCiudad.buscarCiudad(nombre) != null){
                                    Ciudad c=controladorCiudad.buscarCiudad(nombre);
                                    System.out.println("La ciudad es: "+c);
                                }else{
                                    System.out.println("La ciudad no existe");
                                }
                                break;
                            case 6:
                                System.out.println("Volviendo al menú principal...");
                                continue menuPrincipal;
                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;
                        }
                    }
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
}
