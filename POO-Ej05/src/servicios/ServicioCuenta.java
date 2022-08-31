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
package servicios;

import entidades.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    // C)
    public Cuenta crearCuenta() {
        Cuenta nuevaCuenta = new Cuenta();

        System.out.println("Ingrese el número de cuenta: ");
        nuevaCuenta.setNumeroCuenta(sc.nextInt());

        System.out.println("Ingrese el DNI del cliente: ");
        nuevaCuenta.setDNI(sc.nextInt());

        System.out.println("Ingrese el saldo actual de la cuenta: ");
        nuevaCuenta.setSaldoActual(sc.nextDouble());

        System.out.println("Ingrese el interés correspondiente: ");
        nuevaCuenta.setInteres(sc.nextFloat());

        return nuevaCuenta;
    }

    // D)
    public void ingresar(double ingreso, Cuenta cuentaActual) {
        double SaldoActual = cuentaActual.getSaldoActual();
        SaldoActual += ingreso;

        cuentaActual.setSaldoActual(SaldoActual);
    }

    // E)
    public void retirar(double retiro, Cuenta cuentaActual) {
        double SaldoActual = cuentaActual.getSaldoActual();
        if (SaldoActual <= retiro) {
            cuentaActual.setSaldoActual(0);
        } else {
            SaldoActual -= retiro;
            cuentaActual.setSaldoActual(SaldoActual);
        }
    }

    // F)
    public void extraccionRapida(Cuenta cuentaActual) {
        double retiro = 0;
        double SaldoActual = cuentaActual.getSaldoActual();
        double disponible;
        String respuesta = "si";
        boolean bandera = true;

        disponible = SaldoActual * 0.2;
        do {
            if (bandera == false) {
                System.out.println("El monto ingresado no es valido, desea volver a intentarlo?");
                respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("si")) {
                    System.out.println("Ingrese el monto que desea retirar:  (menor al %20 del saldo actual) ");
                    retiro = sc.nextDouble();
                } else {
                    System.out.println("Cancelando la extracción.");
                }
            } else {
                System.out.println("Ingrese el monto que desea retirar:  (menor al %20 del saldo actual) ");
                retiro = sc.nextDouble();
                bandera = false;
            }
        } while (retiro > disponible && respuesta.equals("si"));
        
        if(retiro <= disponible){
            SaldoActual -= retiro;
            cuentaActual.setSaldoActual(SaldoActual);
            System.out.println("Retiro realizado con exito.");
        }
        
    }
    
    // G) 
    public void consultarSaldo(Cuenta cuentaActual){
        System.out.println("El saldo actual de la cuenta es de: " + cuentaActual.getSaldoActual());
    }
    
    // H)
    public void consultarDatos(Cuenta cuentaActual){
        System.out.println("Número de cuenta: " + cuentaActual.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuentaActual.getDNI());
        System.out.println("Saldo actual: " + cuentaActual.getSaldoActual());
        System.out.println("Intereses de la cuenta: " + cuentaActual.getInteres());
    }

}
