/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package poo.ej06;

import entidades.Cafetera;
import java.util.Scanner;
import servicios.CafeteraServicio;

public class POOEj06 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Cafetera cf = new Cafetera();
       CafeteraServicio sv = new CafeteraServicio();
       
        System.out.println("--LLENAR CAFETERA--");
        sv.llenarCafetera(cf);
        
        System.out.println("--SERVIR TAZA--");
        System.out.println("Ingrese el tamaño de la taza en ml: ");
        sv.servirTaza(sc.nextInt(), cf);
        
        System.out.println("--VACIAR CAFETERA--");
        sv.vaciarCafetera(cf);
        
        System.out.println("--AGREGAR CAFÉ--");
        System.out.println("Ingrese la cantidad de café que desea ingresar en ml: ");
        sv.agregarCafe(cf, sc.nextInt());
        
        
    }
    
}
