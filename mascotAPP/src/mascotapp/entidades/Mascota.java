/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

public class Mascota {

    //ATRIBUTOS
    public String nombre;
    public String apodo;
    // conejo, gato, perro, loro, carpincho
    public String tipo;
    public int edad;
    public boolean cola;
    public String raza;
    public String color;

    public int energia;

    // Constructores alt + insert
    public Mascota() {
        energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, int edad, boolean cola, String raza) {
        // le asigna el valor de nombre al objeto que se aplica (this)
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    /**
     * Funcion para pasear
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar) {
        this.energia -= energiaRestar;

        return energia;
    }

    
    /**
     * Funcion destinada a pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas) {
        
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
        }

        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", color=" + color + ", energia=" + energia + '}';
    }

}
