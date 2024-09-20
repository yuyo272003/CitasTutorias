package UI;

import Model.Estudiante;
import Model.Maestro;
import Model.Secretaria;

import java.util.ArrayList;
import java.util.Scanner;
import static UI.UIEstudiantes.*;
import static UI.UIMaestro.*;
import static UI.UISecretaria.*;

public class UIMenu {

    public static ArrayList<Maestro> maestros = new ArrayList<>();
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static ArrayList<Secretaria> secretarias = new ArrayList<>();
    public static Maestro maestroLoggeado;
    public static Estudiante estudianteLoggeado;
    public static Secretaria secretariaLoggeado;


    public static void mostrarMenu(){

        int respuesta;

        do{
            System.out.println("..::Buenas tardes ::..");
            System.out.println("Seleccione una opcion:");

            System.out.println("1. Maestros");
            System.out.println("2. Estudiantes");
            System.out.println("3. Secretaria");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);

            respuesta = Integer.valueOf(sc.nextLine());

            switch(respuesta){
                case 1:
                    loginUsuario(1);
                    break;
                case 2:
                    loginUsuario(2);
                    break;
                case 3:
                    loginUsuario(3);
                    break;
                case 0:
                    System.out.println("...::Bye Bye::..");
                    System.exit(0);
                    break;
                default:
                    System.out.println("..::Opción no valida::..");
                    break;
            }

        }while(respuesta != 0);


    }

public static void loginUsuario(int tipoUsuario){
    System.out.println("Ingrese su correo:");
    Scanner sc = new Scanner(System.in);
    String correoUsuario = sc.nextLine();

    boolean banderaCorreo = true;

    do {
        if (tipoUsuario == 1) {
            for (Maestro maestro : maestros) {
                if (maestro.getCorreo().equals(correoUsuario)) {

                    //maestro con acceso
                    banderaCorreo = false;
                    maestroLoggeado = maestro;
                    System.out.println("Hola Maestro " + maestro.getNombre());
                    maestroMenu();
                }else {
                    System.out.println("Usuario no valido");
                    banderaCorreo = false;
                }
            }
        }

        if (tipoUsuario == 2) {
            for (Estudiante estudiante : estudiantes) {
                if (estudiante.getCorreo().equals(correoUsuario)) {

                    //maestro con acceso
                    banderaCorreo = false;
                    estudianteLoggeado = estudiante;
                    System.out.println("Hola Estudiante " + estudiante.getNombre());
                    estudianteMenu();
                }else {
                    System.out.println("Usuario no valido");
                    banderaCorreo = false;
                }
            }
        }

        if (tipoUsuario == 3) {
            for (Secretaria secretaria : secretarias) {
                if (secretaria.getCorreo().equals(correoUsuario)) {

                    //maestro con acceso
                    banderaCorreo = false;
                    secretariaLoggeado = secretaria;
                    System.out.println("Hola Secretaria " + secretaria.getNombre());
                    secretariaMenu();
                }else {
                    System.out.println("Usuario no valido");
                    banderaCorreo = false;
                }
            }
        }
    }while(banderaCorreo);

}







}
