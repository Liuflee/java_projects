package redessociales;

import java.util.Scanner;
import redessociales.domain.Instagram;
import redessociales.domain.Twitter;

/**
 *
 * @author Sumir
 */


public class RedesSociales {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opc;
        Scanner sc = new Scanner(System.in);
        Instagram ig1 = new Instagram();
        Twitter tw1 = new Twitter();
        
        ig1.setUsuario("Anette");
        ig1.setPassword("chocolate");
        
        tw1.setUsuario("FelipeCamiroaga");
        tw1.setPassword("contrasena");
        
        
        do {
            System.out.println("\nRedes sociales");
            System.out.println("1 - Crear una historia en Instagram");
            System.out.println("2 - Crear una noticia en Twitter");
            System.out.println("3 - Salir");
            opc = sc.nextInt();
            
            switch (opc) {
                
                case 1:
                    System.out.println("\nIngrese su usuario:");
                    String userIg = sc.next();
                    System.out.println("\nIngrese su contrasenha:");
                    String passIg = sc.next();
                    
                    if (ig1.validarCuenta(userIg, passIg)) {
                        System.out.println("\nCuenta validada exitosamente");
                        System.out.println("\nIngrese el mensaje de la historia: ");
                        String historia = sc.next();
                        ig1.setHistoria(historia);
                        
                        System.out.println("¿Quieres publicarla?");
                        System.out.println("1 - Sí");
                        System.out.println("2 - No");
                        int opcPub = sc.nextInt();
                        
                        if (opcPub == 1) {
                            System.out.println("\nHistoria creada exitosamente\n");
                            ig1.setEstado(true);
                        } else if (opcPub == 2) {
                            System.out.println("\nBorrador Guardado\n");
                            ig1.setEstado(false);
                        }
                                               
                        ig1.listar();
                    } else {
                        System.out.println("\nUsuario o Contraseña incorrectas");
                    }
                    break;
                    
                case 2:
                    System.out.println("\nIngrese su usuario:");
                    String userTw = sc.next();
                    System.out.println("\nIngrese su contraseña:");
                    String passTw = sc.next();

                    if (tw1.validarCuenta(userTw, passTw)) {
                        System.out.println("\nCuenta de Twitter validada exitosamente");
                        System.out.println("\nIngrese el mensaje de la noticia: ");
                        String noticia = sc.next();
                        tw1.setNoticia(noticia);
                        System.out.println("\nNoticia creada exitosamente\n");
                        tw1.listar();
                    } else {
                        System.out.println("\nUsuario o Contraseña incorrectas");
                    }
                    break;
                    
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
            }
            
        } while(opc != 3);
        
        
    }
    
}
