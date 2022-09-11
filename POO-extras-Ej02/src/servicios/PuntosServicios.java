/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package servicios;

import entidades.Puntos;
import java.util.Scanner;

public class PuntosServicios {
    
    Scanner sc = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        Puntos nuevoPuntos = new Puntos();
        
        System.out.println("Ingrese la coordenada x del punto 1: ");
        nuevoPuntos.setX1(sc.nextInt());
        System.out.println("Ingrese la coordenada y del punto 1: ");
        nuevoPuntos.setY1(sc.nextInt());
        System.out.println("Ingrese la coordenada x del punto 2: ");
        nuevoPuntos.setX2(sc.nextInt());
        System.out.println("Ingrese la coordenada y del punto 2: ");
        nuevoPuntos.setY2(sc.nextInt());
 
        return nuevoPuntos;
    }
    
    public double calcularDistancia(Puntos coordenadas){
        double distancia, p1, p2;
        p1 = Math.pow(coordenadas.getX2() - coordenadas.getX1(), 2);
        p2 = Math.pow(coordenadas.getY2() - coordenadas.getY1(), 2);
        
        distancia = Math.sqrt(p1+p2);
        
        return distancia;
    }  
}
