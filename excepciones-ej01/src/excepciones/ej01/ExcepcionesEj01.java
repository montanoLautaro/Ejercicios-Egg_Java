/*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
try-catch para probar la nueva excepción que debe ser controlada.
 */
package excepciones.ej01;

import excepciones.ej01.entidad.Persona;
import excepciones.ej01.servicios.PersonaServicio;

public class ExcepcionesEj01 {

    public static void main(String[] args) {
        Persona p1 = null;
        PersonaServicio sv = new PersonaServicio();
        
        try{
            System.out.println(sv.esMayorDeEdad(p1));
        }catch(NullPointerException a){
            System.out.print("ERROR: ");
            System.out.println(a);
        }
    }
    
}
