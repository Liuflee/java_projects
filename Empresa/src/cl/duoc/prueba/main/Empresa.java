
package cl.duoc.prueba.main;

import cl.duoc.prueba.business.Validacion;
import cl.duoc.prueba.domain.Tarjeta;
import cl.duoc.prueba.domain.Trabajador;
import java.util.Date;
import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        
        int opc;
        Scanner sc = new Scanner(System.in);
        Validacion validar = new Validacion();
        Trabajador trabajador1 = new Trabajador();
        Tarjeta tarjeta1 = new Tarjeta();
        
        do {
            
            
            
            System.out.println("Welcome to my menu");
            System.out.println("1 - Crear trabajador");
            System.out.println("2 - Asignar tarjeta");
            System.out.println("3 - Comprar");
            System.out.println("4 - Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    
                    
                    System.out.println("Ingrese un run para el trabajador: ");
                    int run = sc.nextInt();
                    trabajador1.setRun(run);
                    
                    System.out.println("Ingrese el nombre del trabajador: ");
                    String nombre = sc.next();
                    if (!validar.validarNombre(nombre)) {
                        trabajador1.setNombre(nombre);
                    } else {
                        System.out.println("ERROR");
                    }
                    
                    System.out.println("Ingrese el DV del rut: ");
                    String dvStr = sc.next();
                    char dv = dvStr.charAt(0);
                    if (validar.validarDV(dv)) {
                        trabajador1.setDv(dv);
                    } else {
                        System.out.println("ERROR");
                    }
                    break;
                case 2:
                    
                    tarjeta1.setCodigo(tarjeta1.generarCodigo());
                    System.out.println("La clave es ");
                    System.out.println(validar.validarClave(21272532, 2127));
                    tarjeta1.setClave(2127);
                    tarjeta1.setMonto(50000);
                    tarjeta1.setTrabajador(trabajador1);
                    Date fechaVigencia = new Date(2024, 3, 4);
                    tarjeta1.setVigencia(fechaVigencia);
                    System.out.println("La fecha es ");
                    System.out.println(tarjeta1.validarVigencia());
                    
                    
                    
                    break;
                case 3:
                    
                    System.out.println("Ingrese el monto a comprar");
                    int precio = sc.nextInt();
                    int montoDescontado = tarjeta1.descontarMonto(precio);
                    System.out.println("El nuevo monto es: "+ montoDescontado);
                    break;
                case 4:
                    System.out.println("CHAO PESCAO");
                    break;
            }
            
        } while (opc != 4);
        
        
    }
    
}
