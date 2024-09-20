import Model.Estudiante;
import Model.Maestro;
import Model.Usuario;
import UI.UIMaestro;

import static UI.UIMenu.*;



public class Main {
    public static void main(String[] args) {

        Maestro maestro1 = new Maestro("Morales","Morales11@gmail.com",4321,"Ingeniero en Software");
        maestro1.addCursoDisponible("10/10/2024","15:00");
        maestro1.addCursoDisponible("10/10/2025","15:00");
        Maestro maestro2 = new Maestro("Javier Pino","jpino@uv.mx",465654,"Ingeniero en Sistemas");
        maestro2.addCursoDisponible("11/10/2025","15:00");
        maestro2.addCursoDisponible("11/10/2025","15:00");
        maestro2.addCursoDisponible("11/10/2025","15:00");
        Maestro maestro3 = new Maestro("Magdiel Mercado","mamercado@uv.mx",565664,"Ingeniero en Sistemas");

        maestros.add(maestro1);
        maestros.add(maestro2);
        maestros.add(maestro3);
        UIMaestro.maestrosConTutorias.add(maestro1);
        UIMaestro.maestrosConTutorias.add(maestro2);

        /*maestros.add(new Maestro("Morales","Morales11@gmail.com",4321,"Ingeniero en Software"));
        maestros.add(new Maestro("Javier Pino","Pinomx@uv.mx",465654,"Ingeniero en Sistemas"));
        maestros.add(new Maestro("Magdiel Mercado","mamercado@uv.mx",565664,"Ingeniero en Sistemas"));
        maestros.add(new Maestro("Patricia Moreno","pmoreno@uv.mx",56465464,"Ingeniero en Informatica"));*/

        estudiantes.add(new Estudiante("Ingrid Sarahi","ingrdbonita@gmail.com","zs22017036"));
        estudiantes.add(new Estudiante("Julio Gutiérrez","juliogm2003@gmail.com","zs22017036"));
        estudiantes.add(new Estudiante("Alexis Yahir","navamoya12@gmail.com","zs22017036"));
        estudiantes.add(new Estudiante("Emilio Jasso","ingrdbonita@gmail.com","zs22017036"));


        mostrarMenu();




        }



    }
