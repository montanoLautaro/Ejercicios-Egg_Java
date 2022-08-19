/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;


public class MascotAPP {

    public static void main(String[] args) {
        Mascota m1;
        Scanner sc = new Scanner(System.in);
        
//        m1.nombre = "Perrito Moe";
//        m1.apodo = sc.nextLine();
//        m1.tipo = "Perro";
//        m1.edad = 10;
//        m1.raza = "Caniche";
//        m1.cola = true;
//        m1.color = "Blanco";

        //lo mas optimo es asignarlo directamente a los constructores
        
        m1 = new Mascota("Perrito Moe", sc.next(), "Perro", 10, true, "Caniche");
        
        // si yo no especifico el valor de una variable y es de tipo primitivo
        // se le asignan valores por defecto
        
        System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo );
        System.out.println(m1.color); // string por defecto es null
        
        
        
    }

}
