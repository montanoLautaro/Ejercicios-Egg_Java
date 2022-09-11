/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje

• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.

• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona nuevaPersona = new Persona();
        String sexo = "";
        boolean bandera = false;

        System.out.println("Ingrese el nombre de la persona: ");
        nuevaPersona.setNombre(sc.next());
        
        System.out.println("Ingrese la edad: ");
        nuevaPersona.setEdad(sc.nextInt());

        do {
            if (bandera == true) {
                System.out.println("La opción ingresada no es válida.");
                System.out.println("Ingrese el sexo ('H' hombre, 'M' mujer, 'O' otro): ");
                sexo = sc.next();
            } else {
                System.out.println("Ingrese el sexo ('H' hombre, 'M' mujer, 'O' otro): ");
                sexo = sc.next();
                bandera = true;
            }
        } while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O"));

        nuevaPersona.setSexo(sexo);

        System.out.println("Ingrese el peso en kg: ");
        nuevaPersona.setPeso(sc.nextFloat());

        System.out.println("Ingrese la altura en mts: ");
        nuevaPersona.setAltura(sc.nextFloat());

        return nuevaPersona;
    }

    public int calcularIMC(Persona personaActual) {
        int resultado;
        float peso = personaActual.getPeso();
        float altura = personaActual.getAltura();
        float imc = (float) (peso / (Math.pow(altura, 2)));

        if (imc < 20) {
            resultado = -1;
        } else if (imc <= 25) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }

    public boolean esMayorDeEdad(Persona personaActual){
        boolean resultado = false;
        
        if(personaActual.getEdad() > 17){
            resultado = true;
        }
        return resultado;
    }
    
    
}
