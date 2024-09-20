package UI;
import Model.Maestro;

import static UI.UIMenu.*;

import java.util.ArrayList;
import java.util.Scanner;
public class UIMaestro {
    public static ArrayList<Maestro> maestrosConTutorias = new ArrayList<>();

    public static void maestroMenu() {
        int respuesta;
        System.out.println("..:: Maestro "+ maestroLoggeado.getNombre() + "::..");

        do {
        System.out.println("Seleccione una opción");
        System.out.println("1. Agregar una nueva tutoria");
        System.out.println("2. Listar mis tutorias");
        System.out.println("3. Salir");

        Scanner sc = new Scanner(System.in);


            respuesta = Integer.parseInt(sc.nextLine());


            switch (respuesta) {
                case 1:
                    agregarTutoria();
                    break;
                case 2:
                    listarTutorias();
                    break;
                case 3:
                    mostrarMenu();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;


            }


        }while (respuesta != 3) ;

       
    }

    public static void agregarTutoria() {
        System.out.println("Agregar tutoria");

        boolean banderaExterna = true;

        do {

            System.out.println("Ingresa la fecha del curso: [dd/MM/yyyy]");
            Scanner sc = new Scanner(System.in);
            String fecha = sc.nextLine();
            System.out.println("Ingresa la hora del curso: [00:00]");
            String hora = sc.nextLine();

            boolean banderaInterna = true;

            do {
                System.out.println("La tutoria es : " + fecha + " " + hora);
                System.out.println("1.- Para agregar tutoria . \n2.- Cambiar tutoria");
                int respuesta = sc.nextInt();


                if (respuesta == 2) {
                    banderaInterna = false;
                } else if (respuesta == 1) {
                    banderaInterna = false;
                    banderaExterna = false;

                    maestroLoggeado.addCursoDisponible(fecha,hora);
                    consultarMaestroConTutoria(maestroLoggeado);

                } else {
                    System.out.println("Opcion no valida");
                }
            } while (banderaInterna);
        } while (banderaExterna);

        System.out.println(":D");
    }

    private static void consultarMaestroConTutoria(Maestro maestro) {
        if(maestrosConTutorias.contains(maestro)) {
            maestrosConTutorias.add(maestro);
        }
    }

    public static void listarTutorias() {
        System.out.println("Listado de tutorias");

        if (maestroLoggeado.getCursoDisponibles().isEmpty()) {
            System.out.println("No hay tutorias :(");
        }

        int j = 1;
        for(int i=0; i < maestroLoggeado.getCursoDisponibles().size(); i++) {
            System.out.println(j + " .- "+ maestroLoggeado.getCursoDisponibles().get(i).getFecha()
            + " " + maestroLoggeado.getCursoDisponibles().get(i).getHora());
            j++;
        }

    }
}