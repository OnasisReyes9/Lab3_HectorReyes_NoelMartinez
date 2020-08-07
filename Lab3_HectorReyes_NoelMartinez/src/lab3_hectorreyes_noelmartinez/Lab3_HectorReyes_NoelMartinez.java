/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_hectorreyes_noelmartinez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Onasis Reyes
 */
public class Lab3_HectorReyes_NoelMartinez {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    static String superUsuario = "SUDO";
    static String superContraseña = "clau123";

    public static void main(String[] args) {
        // TODO code application logic here
        boolean superLogin = false;
        ArrayList<Piso> torres = new ArrayList();
        boolean continuar = true;
        while (continuar == true) {
            System.out.println("---Menú---");
            System.out.println("1. Agregar Piso");
            System.out.println("2. Agregar Prueba");
            System.out.println("3. Agregar Persona");
            System.out.println("4. Modificar Piso ");
            System.out.println("5. Modificar Prueba ");
            System.out.println("6. Modificar Persona ");
            System.out.println("7. Eliminar Piso");
            System.out.println("8. Eliminar Prueba");
            System.out.println("9. Eliminar Persona ");
            System.out.println("10. Informe");
            System.out.println("11. Visualizar Pisos y Pruebas");
            int opcion = leer.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    if (logSuperUsuario(opcion) == true) {
                        System.out.print("Ingrese ");
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    }
                    break;//AQUI TERMINA LINEA DE ONASIS - OSEA LINEA 72 FINAL DE ONASIS
                case 2://AQUI EMPIEZA LINEA DE NOEL  - OSEA LINEA DE NOEL EMPIEZA EN 73
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
            }//fin switch
        }//fin while

    }

    public static boolean logSuperUsuario(int opcion) {
        boolean login = true;
        if (opcion >= 1 && opcion <= 10) {
            System.out.print("Ingrese nombre de usuario: ");
            String logSuperUsuario = leer.next();
            System.out.print("Ingrese contraseña: ");
            String logSuperContra = leer.next();
            if (!logSuperUsuario.equals(superUsuario)) {
                login = false;
            } else if (!logSuperContra.equals(superContraseña)) {
                login = false;
            }
        }
        System.out.println("");
        if (login == false) {
            System.out.println("¡El usuario o la contraseña no es válida! :C");
        } else {
            System.out.println("¡Has Ingresado con éxito!");
        }
        System.out.println("");
        return login;
    }

}
//LINA 149 SOLO LLEVA ESTE COMENTARIO Y ES LA FINAL