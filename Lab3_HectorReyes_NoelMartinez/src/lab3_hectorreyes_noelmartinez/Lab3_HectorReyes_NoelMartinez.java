/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_hectorreyes_noelmartinez;

import java.util.ArrayList;
import java.util.Random;
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
    static Random ran = new Random();

    public static void main(String[] args) {
        // TODO code application logic here
        //PERDON CLAU :c
        boolean superLogin = false;
        ArrayList<Piso> torres = new ArrayList();
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Prueba> pruebas = new ArrayList();
        ArrayList<Ranker> rankers = new ArrayList();
        ArrayList<Normal> normales = new ArrayList();
        boolean continuar = true;
        while (continuar == true) {
            System.out.println("---Menú---");
            System.out.println("1. Agregar Piso");
            System.out.println("2. Agregar Prueba");
            System.out.println("3. Agregar Persona");
            System.out.println("4. Eliminar Persona");
            System.out.println("5. Eliminar Prueba");
            System.out.println("6. Listar Pruebas");
            //System.out.println("5. Informe Pruebas");
            int opcion = leer.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    if (logSuperUsuario(opcion) == true) {
                        System.out.print("Ingrese nombre del Administrador:");
                        String nombreAdmin = leer.next();
                        System.out.print("Ingrese pos del ranker a ser evaluador: ");
                        int posRanker = leer.nextInt();
                        while (posRanker < 0 || posRanker >= rankers.size()) {
                            System.out.println("Posición no válida");
                            System.out.print("Ingrese pos del ranker a ser evaluador: ");
                            posRanker = leer.nextInt();
                        }
                        System.out.print("Ingrese el nivel entre el rango [1-134]: ");
                        int nivel = leer.nextInt();
                        while (nivel < 1 || nivel > 134) {
                            System.out.println("Nivel Inecxistente :C");
                            System.out.print("Ingrese el nivel entre el rango [1-134]: ");
                            nivel = leer.nextInt();
                        }
                        Piso p = new Piso();
                        torres.add(new Piso(nombreAdmin, rankers.get(0 + ran.nextInt(rankers.size())), nivel));
                        p.añadirRanker(rankers.get(posRanker));
                        if (nivel < 67) {
                            PisoInferior pisoInf = new PisoInferior();
                            pisoInf.añadirPiso(new Piso(nombreAdmin, rankers.get(0 + ran.nextInt(rankers.size())), nivel));
                        } else {
                            PisoSuperior pisoSup = new PisoSuperior();
                            pisoSup.añadirPiso(new Piso(nombreAdmin, rankers.get(0 + ran.nextInt(rankers.size())), nivel));
                        }
                    }
                    break;//
                case 2://
                    if (logSuperUsuario(opcion) == true) {
                        System.out.print("Ingrese nombre de la prueba: ");
                        String nombrePrueba = leer.next();
                        System.out.print("Ingrese la pos del evaluador (debe ser ranker): ");
                        int posRanker = leer.nextInt();
                        while (posRanker < 0 || posRanker >= rankers.size()) {
                            System.out.println("Posición no válida");
                            System.out.print("Ingrese pos del ranker a ser evaluador: ");
                            posRanker = leer.nextInt();
                        }
                        System.out.print("Ingrese 1 si la prueba fue aprobada o cualquier otro "
                                + "numero si no lo fue aprobada: ");
                        int pruebaAprobada = leer.nextInt();
                        String estadoPrueba = "";
                        if (pruebaAprobada == 1) {
                            estadoPrueba = "Aprobado c:";
                        } else {
                            estadoPrueba = "No Aprobado :c </3";
                        }
                        System.out.print("Ingrese una posición de una persona para agregar al equipo: ");
                        int posPersona = leer.nextInt();
                        pruebas.add(new Prueba(nombrePrueba, rankers.get(posRanker), estadoPrueba));
                        pruebas.get(pruebas.size() - 1).getEquipo().add(normales.get(posPersona));
                    }
                    break;
                case 3:
                    if (logSuperUsuario(opcion) == true) {
                        String posicionPersona = "";
                        System.out.println("---Agregar-Personas---");
                        System.out.println("1. Normal");
                        System.out.println("2. Ranker");
                        System.out.print("Escoja el tipo de persona: ");
                        int aggPersona = leer.nextInt();
                        if (aggPersona == 1) {
                            System.out.print("Ingrese su objetivo para escalar la torre: ");
                            String descripcion = leer.next();
                            System.out.print("Ingrese nombre de la persona: ");
                            String nombrePersona = leer.next();
                            System.out.println("");
                            boolean pos = false;
                            while (pos == false) {
                                System.out.println("---Posiciones---");
                                System.out.println("1. Pescador");
                                System.out.println("2. Portador de Lanzas");
                                System.out.println("3. Portador de Luz");
                                System.out.println("4. Explorador");
                                System.out.println("5. Manipulador de Ondas");
                                System.out.println("Escoja la posición de la persona: ");
                                int posPersona = leer.nextInt();
                                switch (posPersona) {
                                    case 1:
                                        posicionPersona = "Pescador";
                                        pos = true;
                                        break;
                                    case 2:
                                        posicionPersona = "Portador de Lanzas";
                                        pos = true;
                                        break;
                                    case 3:
                                        posicionPersona = "Portador de Luz";
                                        pos = true;
                                        break;
                                    case 4:
                                        posicionPersona = "Explorador";
                                        pos = true;
                                        break;
                                    case 5:
                                        posicionPersona = "Manipulador de Ondas";
                                        pos = true;
                                        break;
                                    default:
                                        System.out.println("Ingresa una posición válida :C");
                                }
                            }//fin while posición
                            System.out.print("Ingrese identificación: ");
                            long identificacion = leer.nextLong();
                            pos = false;
                            while (pos == false) {
                                System.out.println("---Estado-Registro---");
                                System.out.println("1. Regular");
                                System.out.println("2. Irregular");
                                System.out.print("-> Escoja el estado de registro: ");
                                String usuario = "";
                                String contraseña = "";
                                int estadoRegistroPos = leer.nextInt();
                                if (estadoRegistroPos == 1) {
                                    System.out.print("Ingrese nombre de usuario: ");
                                    usuario = leer.next();
                                    System.out.println("Ingrese contraseña: ");
                                    contraseña = leer.next();
                                    personas.add(new Normal(descripcion, nombrePersona, new Posicion(posicionPersona),
                                            identificacion, new Regular(contraseña, usuario)));
                                } else if (estadoRegistroPos == 2) {
                                    personas.add(new Normal(descripcion, nombrePersona, new Posicion(posicionPersona),
                                            identificacion, new Irregular()));
                                    System.out.println("No tienes permiso por lo tanto no tienes usuario ni contraseña");
                                    pos = true;
                                } else {
                                    System.out.println("La opcion no existe :C");
                                    pos = true;
                                }
                            }//fin while pos
                            normales.add(new Normal(descripcion, nombrePersona, new Posicion(posicionPersona),
                                    identificacion, new Irregular()));
                        } else if (aggPersona == 2) {//Ranker
                            System.out.print("Ingrese nombre de la persona: ");
                            String nombrePersona = leer.next();
                            System.out.println("");
                            boolean pos = false;
                            while (pos == false) {
                                System.out.println("---Posiciones---");
                                System.out.println("1. Pescador");
                                System.out.println("2. Portador de Lanzas");
                                System.out.println("3. Portador de Luz");
                                System.out.println("4. Explorador");
                                System.out.println("5. Manipulador de Ondas");
                                System.out.println("Escoja la posición de la persona: ");
                                int posPersona = leer.nextInt();
                                switch (posPersona) {
                                    case 1:
                                        posicionPersona = "Pescador";
                                        pos = true;
                                        break;
                                    case 2:
                                        posicionPersona = "Portador de Lanzas";
                                        pos = true;
                                        break;
                                    case 3:
                                        posicionPersona = "Portador de Luz";
                                        pos = true;
                                        break;
                                    case 4:
                                        posicionPersona = "Explorador";
                                        pos = true;
                                        break;
                                    case 5:
                                        posicionPersona = "Manipulador de Ondas";
                                        pos = true;
                                        break;
                                    default:
                                        System.out.println("Ingresa una posición válida :C");
                                }
                            }//fin while posición
                            System.out.print("Ingrese identificación: ");
                            long identificacion = leer.nextLong();
                            pos = false;
                            while (pos == false) {
                                System.out.println("---Estado-Registro---");
                                System.out.println("1. Regular");
                                System.out.println("2. Irregular");
                                System.out.print("-> Escoja el estado de registro: ");
                                String usuario = "";
                                String contraseña = "";
                                int estadoRegistroPos = leer.nextInt();
                                if (estadoRegistroPos == 1) {
                                    System.out.print("Ingrese nombre de usuario: ");
                                    usuario = leer.next();
                                    System.out.println("Ingrese contraseña: ");
                                    contraseña = leer.next();
                                    personas.add(new Ranker(nombrePersona, new Posicion(posicionPersona),
                                            identificacion, new Regular(contraseña, usuario)));
                                } else if (estadoRegistroPos == 2) {
                                    personas.add(new Ranker(nombrePersona, new Posicion(posicionPersona),
                                            identificacion, new Irregular()));
                                    System.out.println("No tienes permiso por lo tanto no tienes usuario ni contraseña");
                                    pos = true;
                                } else {
                                    System.out.println("La opcion no existe :C");
                                    pos = true;
                                }
                            }//fin while pos
                            rankers.add(new Ranker(nombrePersona, new Posicion(posicionPersona),
                                    identificacion, new Irregular()));
                        } else {
                            System.out.println("La opción no existe :c");
                        }
                    }
                    break;
                case 4://HOLIS CLAU
                    if (logSuperUsuario(opcion) == true) {
                        System.out.print("Ingrese la posición de la torre que desa eliminarle una persona: ");
                        int posTorre = leer.nextInt();
                        System.out.print("Ingrese la posición de la persona que desea eliminar: ");
                        int posEliminar = leer.nextInt();
                        torres.get(posTorre).getPersonas().remove(posEliminar);
                    }
                    break;
                case 5://eliminar prueba
                    if (logSuperUsuario(opcion) == true) {
                        System.out.print("Ingrese pos de la prueba a eliminar: ");
                        int posPrueba = leer.nextInt();
                        pruebas.remove(posPrueba);
                    }
                    break;
                case 6:
                    for (int i = 0; i < pruebas.size(); i++) {
                        System.out.println(i + ". " + pruebas.size());
                    }
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 12:
                    System.out.println("");
                    break;
            }//fin switch
            System.out.println("");
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
