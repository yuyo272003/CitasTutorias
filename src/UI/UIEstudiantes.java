package UI;

import java.util.Scanner;

public class UIEstudiantes {

    public final static String [] MESES = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"
            ,"Septiembre","Octubre","Noviembre","Diciembre"};


    public static void estudianteMenu(){

        int respuesta;
        do {
            System.out.println("..::Estudiantes ::..");
            System.out.println("1. Agendar tutoria");
            System.out.println("2. Mis tutorias");
            System.out.println("0. Cancelar");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch(respuesta){
                case 1:
                    agendarTutoria();
                    break;
                case 2:
                    listarMisTutorias();
                    break;
                case 0:
                    System.out.println("Bye Bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Por favor seleccione una respuesta valida");
                    break;

            }



        }while (respuesta != 0);
    }

    private static void agendarTutoria() {

        System.out.println("..::Agendar Tutoria::..");


    }


    private static void listarMisTutorias() {
        System.out.println("..::Listar Tutorias::..");

    }


}
