/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package poo.ej02;

import entidades.Circunferencia;

public class POOEj02 {

    
    public static void main(String[] args) {
        Circunferencia circ = new Circunferencia(0);
        float area, perimetro;
        
        circ.crearCircunferencia();
        
        area = circ.area();
        perimetro = circ.perimetro();
        
        System.out.println("El área de la circunferencia es de " + area + " y el perímetro es de " + perimetro + ".");
    }
    
}
