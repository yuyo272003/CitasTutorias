package Model;
import java.util.ArrayList;

public class Maestro extends Usuario {

    //Atributos
    public static int ID = 1;

    private int numPersonal;
    private String especialidad;

    public String getEspecialidad() {

        return especialidad;
    }

    public void setEspecialidad(String especialidad) {

        this.especialidad = especialidad;
    }

    public int getNumPersonal() {

        return numPersonal;
    }

    public void setNumPersonal(int numPersonal) {

        this.numPersonal = numPersonal;
    }

    //Comportamientos/Metodos

    public Maestro(String nombre,String correo,int numPersonal, String especialidad) {

        super(nombre, correo);
        this.numPersonal = numPersonal;
        this.especialidad = especialidad;

    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + getNombre());
    }

    public void mostrarID() {
        System.out.println("ID: " + numPersonal);
    }

    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();



    public void addCursoDisponible(String fecha, String hora) {
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));
    }


    public ArrayList<TutoriasDisponibles> getCursoDisponibles() {
        return tutoriasDisponibles;
    }

    public static class TutoriasDisponibles extends CitaTutoria {
        public TutoriasDisponibles(String fecha, String hora) {
            super(fecha, hora);
        }
    }



    @Override
    public String toString() {
        return super.toString() + " " + " Número de Personal: " + numPersonal + " Especialidad: " + especialidad
               +  "\n Los cursos disponibles son \n " +  tutoriasDisponibles.toString() ;
    }

    @Override
    public void saludar() {
        System.out.println("Hola maestro");
    }

}
