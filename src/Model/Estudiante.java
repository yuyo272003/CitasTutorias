package Model;

import java.util.ArrayList;
import java.util.Date;

public class Estudiante extends Usuario{


     private String matricula;
     private String semestre;
     ArrayList<CitaMaestro> tutoriasAgendadas = new ArrayList();


     public String getSemestre() {
          return semestre;
     }

     public void setSemestre(String semestre) {
          this.semestre = semestre;
     }

     public String getMatricula() {
          return matricula;
     }

     public void setMatricula(String matricula) {
          this.matricula = matricula;
     }



     public Estudiante(String nombre, String correo,String matricula) {

       super(nombre,correo);
       this.matricula = matricula;

     }

     @Override
     public String toString() {
          return "Model.Estudiante{" +
                  "matricula='" + matricula + '\'' +
                  ", semestre='" + semestre + '\'' +
                  '}';
     }

     @Override
     public void saludar() {
          System.out.println("Hola Estudiante");
     }

     public void addTutoriasMaestro(Maestro maestro, Date fecha, String hora){
          CitaMaestro citaMaestro = new CitaMaestro(maestro,this);
          citaMaestro.agendar(fecha, hora);
          tutoriasAgendadas.add(new CitaMaestro(maestro,this));
     }

     public ArrayList<CitaMaestro> getTutoriasAgendadas() {
          return tutoriasAgendadas;
     }
}