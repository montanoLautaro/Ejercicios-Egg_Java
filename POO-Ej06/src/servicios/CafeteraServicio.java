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
package servicios;

import entidades.Cafetera;

public class CafeteraServicio {
    
    
    
    public void llenarCafetera(Cafetera cafeteraActual){
        System.out.println("Se llenó la cafetera.");
        cafeteraActual.setCantidadActual(cafeteraActual.getCapacidadMaxima());
    }
    
    public void servirTaza(int tamanioTaza, Cafetera cafeteraActual){
        int cantidadCafe = cafeteraActual.getCantidadActual();
        int contenidoTaza = 0;
        
        if(cantidadCafe >= tamanioTaza){
            contenidoTaza = tamanioTaza;
            cantidadCafe -= tamanioTaza;
            cafeteraActual.setCantidadActual(cantidadCafe);
            System.out.println("Se llenó la taza con café.");
        }else{
            contenidoTaza = cantidadCafe;
            cafeteraActual.setCantidadActual(0);
            System.out.println("La taza no se pudo llenar, la taza ahora tiene " + cantidadCafe + "ml de café.");
        }
    }
    
    public void vaciarCafetera(Cafetera cafeteraActual){
        System.out.println("Se vació la cafetera.");
        cafeteraActual.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera cafeteraActual, int cafeIngresado){
        int cantidadCafe = cafeteraActual.getCantidadActual();
        
        if((cantidadCafe + cafeIngresado) <= cafeteraActual.getCapacidadMaxima()){
            System.out.println("Se agregó el café.");
            cafeteraActual.setCantidadActual( cantidadCafe + cafeIngresado);
        }else{
            System.out.println("La cantidad de café ingresado hace que se supere la capacidad máxima de la cafetera.");
        }
        
    }
    
}
