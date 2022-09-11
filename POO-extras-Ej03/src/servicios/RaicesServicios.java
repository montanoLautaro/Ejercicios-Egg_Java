/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvio true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvio true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package servicios;

import entidades.Raices;
import java.util.Scanner;

public class RaicesServicios {

    Scanner sc = new Scanner(System.in);

    public Raices formatearEcuacion() {
        Raices ecuacion = new Raices();

        System.out.println("Ingrese un valor para el coeficiente a: ");
        ecuacion.setA(sc.nextInt());
        System.out.println("Ingrese un valor para el coeficiente b: ");
        ecuacion.setB(sc.nextInt());
        System.out.println("Ingrese un valor para el coeficiente c: ");
        ecuacion.setC(sc.nextInt());
        return ecuacion;
    }

    public double getDiscriminante(Raices ecuacion) {
        double discriminante;

        discriminante = Math.pow(ecuacion.getB(), 2) - (4 * ecuacion.getA() * ecuacion.getC());

        return discriminante;
    }

    public boolean tieneRaices(Raices ecuacion) {
        boolean resultado = false;
        if (getDiscriminante(ecuacion) > 0) {
            resultado = true;
        }
        return resultado;
    }

    public boolean tieneRaiz(Raices ecuacion) {
        boolean resultado = false;
        if (getDiscriminante(ecuacion) == 0) {
            resultado = true;
        }
        return resultado;
    }

    public void obtenerRaices(Raices ecuacion) {

        double raizA, raizB;

        if (tieneRaices(ecuacion)) {
            raizA = (-ecuacion.getB() - Math.sqrt((Math.pow(ecuacion.getB(), 2)) - (4 * ecuacion.getA() * ecuacion.getC()))) / (2 * ecuacion.getA());
            raizB = (-ecuacion.getB() + Math.sqrt((Math.pow(ecuacion.getB(), 2)) - (4 * ecuacion.getA() * ecuacion.getC()))) / (2 * ecuacion.getA());

            System.out.println("Posible solución A: " + raizA);
            System.out.println("Posible solución B: " + raizB);
        }
    }

    public void obtenerRaiz(Raices ecuacion) {

        double resultado;

        if (tieneRaiz(ecuacion)) {
            resultado = (-ecuacion.getB()) / (2 * ecuacion.getA());
            System.out.println("La solución es: " + resultado);
        }
    }

    public void calcular(Raices ecuacion){
        
        if(tieneRaices(ecuacion)){
            obtenerRaices(ecuacion);
        }else if(tieneRaiz(ecuacion)){
            obtenerRaiz(ecuacion);
        }else{
            System.out.println("No tiene ninguna solución.");
        }
        
        
    }
    
}
