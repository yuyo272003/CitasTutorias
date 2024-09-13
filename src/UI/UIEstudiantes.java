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
                    System.out.println("Agendar tutoria");
                    System.out.println("Seleccione una opcion:");
                    for(int i = 0;i < 12;i++){
                        System.out.println((i + 1)+ " " + MESES[i]);
                    }
                    break;
                case 2:
                    System.out.println("Mis tutorias");
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
}
