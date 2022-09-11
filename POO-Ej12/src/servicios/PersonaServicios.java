/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior. 
 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicios {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona nuevaPersona = new Persona();
        
        int dia, mes, anio;
        
        System.out.println("Ingrese el nombre: ");
        nuevaPersona.setNombre(sc.next());
        
        System.out.println("Ingrese la fecha de nacimiento: ");
        System.out.print("Día: ");
        dia = sc.nextInt();
        System.out.print("Mes: ");
        mes = sc.nextInt();
        System.out.print("Año: ");
        anio = sc.nextInt();
        Date fechaNacimiento = new Date(anio-1900, mes -1 , dia);
        nuevaPersona.setFechaNacimiento(fechaNacimiento);
        
        return nuevaPersona;
    }
    
    public void calcularEdad(Persona personaActual){
        Date fechaActual = new Date();
        int anio = Math.abs(fechaActual.getYear() - personaActual.getFechaNacimiento().getYear());
        int dias = Math.abs(fechaActual.getDay()- personaActual.getFechaNacimiento().getDay());
        int meses = Math.abs(fechaActual.getMonth()- personaActual.getFechaNacimiento().getMonth());
        System.out.println("Tiene " + anio + " años, " + meses + " meses y " + dias + " días."); 
    }
    
    public boolean menorQue(int edad, Persona personaActual){
        boolean resultado = false;
        if(personaActual.getFechaNacimiento().getYear() < edad){
            resultado = true;
        }
        return resultado;
    }
    
    public void mostrarPersona(Persona personaActual){
        System.out.println("Nombre: " + personaActual.getNombre());
        System.out.println("Fecha de nacimiento: " + personaActual.getFechaNacimiento());
    }
    
   
    
}
