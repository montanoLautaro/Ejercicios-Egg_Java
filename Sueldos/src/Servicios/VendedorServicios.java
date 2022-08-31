
package Servicios;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;


public class VendedorServicios {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Vendedor altaVendedor(){
        
        // instanciacion
        Vendedor v1 = new Vendedor();
        
        // llenar atributos
        System.out.println("Ingrese el nombre del vendedor: ");
        v1.setNombre(sc.next());
        
        System.out.println("Ingrese el DNI del vendedor: ");
        v1.setDni(sc.nextInt());
        
        System.out.println("Ingrese el sueldo básico del vendedor: ");
        v1.setSueldoBasico(sc.nextDouble());
        
        System.out.println("Ingrese el día en que inicio a trabajar el vendedor: ");
        int dia = sc.nextInt();
        
        System.out.println("Ingrese el mes de ingreso: ");
        int mes = sc.nextInt();
        
        System.out.println("Ingrese el año de ingreso: ");
        int anio = sc.nextInt();
        
        Date fecha = new Date(anio-1900, mes-1, dia);
        v1.setFechaInicio(fecha);
        
        return v1;
    }
    
    public void SueldoMensual(Vendedor v1){
        System.out.println("Ingrese cuales fueron las ventas totales del vendedor:");
        Double ventas = sc.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        
        System.out.println("El sueldo mensual del vendedor: "
        +v1.getNombre() + " es de $" + v1.getSueldoMensual());  
    }
    
    public void vacaciones(Vendedor v1){
        Date hoy = new Date();
        
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        
        if(antiguedad <5){
            System.out.println("Le corresponden 14 días de vacaciones. ");
        }else if(antiguedad < 10){
            System.out.println("Le corresponden 21 días de vacaciones.");
        }else if(antiguedad < 20){
            System.out.println("Le corresponden 28 días de vacaciones.");
        }else if(antiguedad > 20){
            System.out.println("Le corresponden 35 días de vacaciones.");
        }else{
            System.out.println("El empleado tiene vacaciones proporcionales. ");
        }
    }
    
}
