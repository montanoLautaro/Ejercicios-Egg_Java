/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package guia5.java__extras;

/**
 *
 * @author hered
 */
public class Extra12 {

    public static void main(String[] args) {
        int contadorA, contadorB, contadorC;
        String cadenaA, cadenaB, cadenaC;

        cadenaA = "0";
        cadenaB = "0";
        cadenaC = "0";

//        for (contadorA = 0; contadorA < 11; contadorA++) {
//            for (contadorB = 0; contadorB < 10; contadorB++) {
//                cadenaB = String.valueOf(contadorB);
//
//                for (contadorC = 0; contadorC < 10; contadorC++) {
//                    cadenaC = String.valueOf(contadorC);
//                    if (cadenaC.equals("3")) {
//                        cadenaC = "E";
//                    }
//                    if (cadenaB.equals("3")) {
//                        cadenaB = "E";
//                    }
//                    if (cadenaA.equals("3")) {
//                        cadenaA = "E";
//                    }
//                    System.out.println("(" + cadenaA + "-" + cadenaB + "-" + cadenaC + ")");
//                }
//
//            }
//            cadenaA = String.valueOf(contadorA);
//        }
        for (contadorA = 0; contadorA < 10; contadorA++) {
            cadenaA = String.valueOf(contadorA);
            if (cadenaA.equals("3")) {
                cadenaA = "E";
            }
            for (contadorB = 0; contadorB < 10; contadorB++) {
                cadenaB = String.valueOf(contadorB);
                if (cadenaB.equals("3")) {
                    cadenaB = "E";
                }
                for (contadorC = 0; contadorC < 10; contadorC++) {
                    cadenaC = String.valueOf(contadorC);
                    if (cadenaC.equals("3")) {
                        cadenaC = "E";
                    }
                    System.out.println("(" + cadenaA + "-" + cadenaB + "-" + cadenaC + ")");
                }

            }

        }

    }

}
