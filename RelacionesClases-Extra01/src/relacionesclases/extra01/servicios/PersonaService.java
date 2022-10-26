/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package relacionesclases.extra01.servicios;

import java.util.ArrayList;
import java.util.List;
import librerias.Consola;
import relacionesclases.extra01.entidades.Perro;
import relacionesclases.extra01.entidades.Persona;

public class PersonaService {

    List<Perro> listaPerros = new ArrayList();
    List<Persona> listaPersonas = new ArrayList();

    public void setearPerros() {
        listaPerros.add(new Perro("Moe", "Caniche", 10, 0.3));
        listaPerros.add(new Perro("Poli", "Bulldog", 8, 0.4));
        listaPerros.add(new Perro("Hades", "Caniche", 4, 0.4));
        listaPerros.add(new Perro("Zeus", "Labrador", 1, 0.6));
        listaPerros.add(new Perro("Tobi", "Pitbull", 12, 0.8));
    }

    public Persona crearPersona(int numero) {
        Persona p = new Persona();
        System.out.println("\nIngreso de datos de la persona  N°" + numero);
        p.setNombre(Consola.leer("Ingrese el nombre: "));
        p.setApellido(Consola.leer("Ingrese su apellido: "));
        p.setEdad(Consola.leerEntero("Ingrese su edad: "));
        p.setDocumento(Consola.leerEntero("Ingrese su documento: "));

        seleccionarPerro(p);

        return p;
    }

    public void seleccionarPerro(Persona p) {
        String nombrePerro;
        Boolean resultado = false;
        System.out.println("\t--LISTA DE PERROS SIN DUEÑO--");
        for (Perro perro : listaPerros) {
            if (perro.getDuenio() == null) {
                System.out.println(perro.toString());
            }
        }
        do {
            nombrePerro = Consola.leer("Ingrese el nombre del perro que desea adoptar: ");

            for (Perro perro : listaPerros) {
                if (perro.getDuenio() == null) {
                    if (perro.getNombre().equalsIgnoreCase(nombrePerro)) {
                        p.setPerro(perro);
                        perro.setDuenio(p);
                        resultado = true;
                        break;
                    }
                }
            }
            if(resultado == false){
                System.out.println("No se encontró el perro con el nombre ingresado, intentelo nuevamente.");
            }
        }while(resultado != true);
    
    }

    public void setearListaPersonas(){
        for (int i = 1; i <= 5; i++) {
            listaPersonas.add(crearPersona(i));
        }
    }
    
    public void mostrarPersonas(){
        System.out.println("\t--LISTAS DE PERSONAS CON SU RESPECTIVO PERRO--");
        for (Persona p : listaPersonas) {
            System.out.println(p.toString());
        }
    }
    
    
    public void usarPersonas(){
        System.out.println("Cargando el programa....");
        setearPerros();
        setearListaPersonas();
        
        mostrarPersonas();
        
    }
}
