/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package poo.ej05;

import entidades.Cuenta;
import java.util.Scanner;
import servicios.ServicioCuenta;

public class POOEj05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServicioCuenta sv = new ServicioCuenta();
        Cuenta lautaroM = sv.crearCuenta();
        
        System.out.println("--INGRESAR DINERO--");
        System.out.println("Ingrese el monto a ingresar: ");
        sv.ingresar(sc.nextDouble(), lautaroM);
        
        System.out.println("--RETIRAR DINERO--");
        System.out.println("Ingrese el monto a retirar: ");
        sv.retirar(sc.nextDouble(), lautaroM);
        
        System.out.println("--EXTRACCIÓN RÁPIDA--");
        sv.extraccionRapida(lautaroM);
        
        System.out.println("--CONSULTA DE SALDO--");
        sv.consultarSaldo(lautaroM);
        
        System.out.println("--CONSULTA DE DATOS--");
        sv.consultarDatos(lautaroM);
    }
    
}
