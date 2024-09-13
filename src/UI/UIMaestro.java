package UI;
import static UI.UIMenu.*;
import java.util.Scanner;
public class UIMaestro {

    public static void maestroMenu() {
        int respuesta;
        System.out.println("..:: Maestro "+ maestroLoggeado.getNombre() + "::..");
        System.out.println("Seleccione una opción");
        System.out.println("1. Agregar curso");
        System.out.println("2. Listar mis cursos");
        System.out.println("3. Salir");

        Scanner sc = new Scanner(System.in);

        do {
            respuesta = Integer.parseInt(sc.nextLine());
            switch (respuesta) {
                case 1:
                    System.out.println("Ingrese un nombre del curso");
                    break;
                case 2:
                    System.out.println("Listar mis cursos");
                    break;
                case 3:
                    mostrarMenu();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;


            }


        }while (respuesta != 3) ;

        public static void agregarTutoria(){
            System.out.println("Agregar tutoria");
            System.out.println("Ingresa la fecha del curso");
            Scanner sc = new Scanner(System.in);
            String fecha = sc.nextLine();
            System.out.println("Ingresa la hora del curso");
        }
    }
}