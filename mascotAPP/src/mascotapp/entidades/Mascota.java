/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

public class Mascota {

    public String nombre;
    public String apodo;
    // conejo, gato, perro, loro, carpincho
    public String tipo;
    public int edad;
    public boolean cola;
    public String raza;
    public String color;

    
    // Constructores alt + insert
    public Mascota(){
        
    }
    

    public Mascota(String nombre, String apodo, String tipo, int edad, boolean cola, String raza) {
        // le asigna el valor de nombre al objeto que se aplica (this)
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }
    
}
