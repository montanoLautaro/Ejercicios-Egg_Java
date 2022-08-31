/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author hered
 */
public class PersonaService {
    public Persona crearPersona(){
        Persona personaCompleta = new Persona();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la persona:");
        personaCompleta.setNombre(sc.next());
        
        System.out.println("Ingrese el apellido de la persona:");
        personaCompleta.setApellido(sc.next());
        
        System.out.println("Ingrese la edad: ");
        personaCompleta.setEdad(sc.nextInt());
        
        System.out.println("Ingrese el id: ");
        personaCompleta.setId(sc.nextInt());
        
        
        return personaCompleta;
    }
    
    public void MostrarPersona(Persona persona){
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("ID: " + persona.getId());
    }
}
