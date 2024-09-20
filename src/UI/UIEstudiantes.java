package UI;

import Model.Maestro;

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

        int respuestaConfirmacion = 0;

        do {

            System.out.println("Seleccione un maestro: ");
            int i = 1;
            for (Maestro maestro : UIMaestro.maestrosConTutorias) {
                System.out.println(i + " " + maestro.getNombre());
                i++;
            }
            Scanner sc = new Scanner(System.in);
            int respuestaMaestro = sc.nextInt();

            Maestro maestroSeleccionado = UIMaestro.maestrosConTutorias.get(respuestaMaestro-1);


            System.out.println("Seelccione una tutoria: ");
            i = 1;
            for (Maestro.TutoriasDisponibles td : UIMaestro.maestrosConTutorias.get(respuestaMaestro - 1).getCursoDisponibles()) {
                System.out.println(i + " .- "+ td.getFecha() + " " + td.getHora());
                i++;
            }
            int tutoriaSeleccionado = sc.nextInt();


            do{
                System.out.println("Maestro " + maestroSeleccionado.getNombre() +
                        " ,Tutoria: " + maestroSeleccionado.getCursoDisponibles().get(tutoriaSeleccionado-1));
                System.out.println("1.- Para continuar. \n2.- Cambiar Tutoria. ");
                respuestaMaestro = sc.nextInt();

            }while(respuestaMaestro < 1 || respuestaMaestro > 2);

            if(respuestaConfirmacion == 1){
                Maestro.TutoriasDisponibles ts = maestroSeleccionado.getCursoDisponibles().get(tutoriaSeleccionado-1);

                UIMenu.estudianteLoggeado.addTutoriasMaestro(maestroSeleccionado,ts.getFecha(), ts.getHora());
            }
        }while(respuestaConfirmacion != 1);

    }


    private static void listarMisTutorias() {
        System.out.println("..::Listar Tutorias::..");

    }


}
