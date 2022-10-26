/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package relacionesclases.ej01;

import librerias.Consola;
import relacionesclases.ej01.entidades.Perro;
import relacionesclases.ej01.entidades.Persona;

public class RelacionesClasesEj01 {

    public static void main(String[] args) {
        Perro dog1 = new Perro("Moe", "Caniche", 10, 0.5);
        Perro dog2 = new Perro("Poli", "Bulldog", 8, 0.6);

        Persona p1 = crearPersona(dog1,dog2);
        Persona p2 = crearPersona(dog1,dog2);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

    public static Persona crearPersona(Perro dog1, Perro dog2) {
        Persona p = new Persona();
        int opcion;
        boolean bandera = false;
        p.setNombre(Consola.leer("Ingrese el nombre: "));
        p.setApellido(Consola.leer("Ingrese el apellido: "));
        p.setEdad(Consola.leerEntero("Ingrese la edad: "));
        p.setDocumento(Consola.leerEntero("Ingrese el documento: "));

        do {
            System.out.println("Seleccione su mascota: ");
            System.out.println("1. " + dog1.getNombre());
            System.out.println("2. " + dog2.getNombre());
            opcion = Consola.leerEntero();
            switch(opcion){
                case 1:
                    p.setPerro(dog1);
                    bandera = true;
                    break;
                case 2:
                    p.setPerro(dog2);
                    bandera = true;
                    break;
                default:
                    System.out.println("La opcion ingresada no es válida.");
                    break;
            }
        }while(bandera == false);
        
        
        return p;
    }
}
