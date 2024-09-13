package Model;

public class Estudiante extends Usuario{


     private String matricula;
     private String semestre;


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

     }
}