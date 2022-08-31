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
package entidades;

import java.util.Scanner;

public class Circunferencia {
    private float radio;
    private Scanner sc = new Scanner(System.in);

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio: ");
        setRadio(sc.nextFloat());

    }
    
    public float area(){
        float area;
        
        area = (float) (Math.PI * (radio * radio));
        
        return area;
    }
    
    public float perimetro(){
        float perimetro;
        
        perimetro = (float) (2 * Math.PI * radio);
        
        return perimetro;
    }
    
}
