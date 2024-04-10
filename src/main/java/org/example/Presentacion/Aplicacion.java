package org.example.Presentacion;
import org.example.Controladores.ControladorDepartamento;

import org.example.Modelo.Departamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        ControladorDepartamento controladorDepartamento = new ControladorDepartamento();
        String nombre, capital, descripcion;
        int poblacion, opcion=0;
        List<Departamento> departamentos=new ArrayList<>();

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
                                System.out.println("Se elimino el departamento: "+ controladorDepartamento.buscarDepartamento(nombre));
                                controladorDepartamento.eliminarDepartamento(nombre);

                                break;
                            case 3:
                                System.out.println("Los departamenos actuales son: ");
                                System.out.println(controladorDepartamento.getDepartamentos());;
                                break;
                            case 4:
                                System.out.println("Ingrese el nombre del departamento a modificar");
                                String nombreModificar = entrada.next();
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
                                break;
                            case 5:
                                System.out.println("Ingrese el nombre del departamento");
                                nombre = entrada.next();
                                departamento=controladorDepartamento.buscarDepartamento(nombre);
                                System.out.println("El departamento es: "+departamento);
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
                        System.out.println("3. Mostrar todos lss ciudades actuales");
                        System.out.println("4. Actualizar ciudad");
                        System.out.println("5.Buscar ciudad");
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
                                System.out.println("Se elimino el departamento: "+ controladorDepartamento.buscarDepartamento(nombre));
                                controladorDepartamento.eliminarDepartamento(nombre);

                                break;
                            case 3:
                                System.out.println("Los departamenos actuales son: ");
                                System.out.println(controladorDepartamento.getDepartamentos());;
                                break;
                            case 4:
                                System.out.println("Ingrese el nombre del departamento a modificar");
                                String nombreModificar = entrada.next();
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
                                break;
                            case 5:
                                System.out.println("Ingrese el nombre del departamento");
                                nombre = entrada.next();
                                departamento=controladorDepartamento.buscarDepartamento(nombre);
                                System.out.println("El departamento es: "+departamento);
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
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
}
