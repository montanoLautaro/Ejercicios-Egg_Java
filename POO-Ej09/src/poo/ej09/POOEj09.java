/*
Método Static y Clase Math

Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package poo.ej09;

import entidades.Matematica;
import servicios.MatematicaServicio;

public class POOEj09 {

    public static void main(String[] args) {
        MatematicaServicio sv = new MatematicaServicio();
        double random1 = Math.random() * 10;
        double random2 = Math.random() * 10;
        Matematica mt = new Matematica(random1, random2);
        
        System.out.println("Numero 1:" + mt.getNumero1());
        System.out.println("Numero 2:" + mt.getNumero2());
        
        System.out.println("--MAYOR DE LOS DOS NUMEROS--");
        System.out.println(sv.devolverMayor(mt));
        
        System.out.println("--CALCULAR POTENCIA--");
        System.out.println(sv.calcularPotencia(mt));
        
        System.out.println("--CALCULAR RAIZ--");
        System.out.println(sv.calculaRaiz(mt));
    }
    
}
