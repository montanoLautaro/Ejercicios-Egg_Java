/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo.
 */
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import librerias.Consola;

public class AlumnoServicio {

    public Alumno crearAlumno() {
        Alumno nuevoAlumno = new Alumno();
        
        
        nuevoAlumno.setNombre(Consola.leer("Ingrese el nombre del alumno: "));

        System.out.println("Ingreso de las 3 notas.");


        for (int i = 0; i < 3; i++) {
            nuevoAlumno.getNotas().add(Consola.leerEntero("Ingrese una nota: "));
 
        }


        return nuevoAlumno;
    }
    
    
    public void cargarEnLista(ArrayList<Alumno> lista){
        String respuesta;
        do {
            lista.add(crearAlumno());
            respuesta = Consola.leer("Desea ingresar otro alumno?(si/no): ");
            while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                System.out.println("La opción ingresada no es válida.");
                respuesta = Consola.leer("Desea ingresar otro alumno?(si/no): ");
            }
        } while (respuesta.equals("si"));
    }
    

    public double notaFinal(Alumno al){
        double resultado, acumulador;
        acumulador = 0;      
        for (Integer aux : al.getNotas()) {
            acumulador += aux;
        }
        return resultado = acumulador / 3;
    }
    
    
    public void notaFinalPorAlumno(ArrayList<Alumno> lista){
        String nombreAlumno = Consola.leer("Ingrese el nombre del alumno el cual desea ver su nota final: ");
        boolean encontrado = false;
        
        for (Alumno alumno : lista) {
            if(alumno.getNombre().equalsIgnoreCase(nombreAlumno)){
                System.out.println("La nota final del alumno " + alumno.getNombre() + " es " + notaFinal(alumno));
                encontrado = true;
            }
        }
        
        if(encontrado == false){
            System.out.println("El alumno ingresado no esta en la lista de alumnos.");
        }
    }

}
