import Model.Estudiante;
import Model.Maestro;
import Model.Usuario;
import static UI.UIMenu.*;



public class Main {
    public static void main(String[] args) {

        /* Model.Maestro maestro = new Model.Maestro("Luis Antonio Morales");
        maestro.mostrarNombre();
        maestro.mostrarID();

        maestro.id++;

        Model.Maestro maestro2 = new Model.Maestro();
        maestro2.nombre = "Patricia Martinez Moreno";
        maestro2.mostrarNombre();
        maestro2.mostrarID();

       maestro2.id++;

       maestro.id++;

       maestro2.mostrarID();

       // mostrarMenu();

        int num1 = 2;
        int num2 = 5;
        int num3 = 5;

        double dNum1 = 2.15;
        double dNum2 = 5.36;
        double dNum3 = 5.14;

        Calculadora.sumar(num1,num2);
        Calculadora.sumar(num1,num2,num3);
        double resultado = Calculadora.sumar(dNum1,dNum2,dNum3);
        System.out.println("EL RESULTADO ES  " + resultado);

        Model.Maestro maestro = new Model.Maestro();
        maestro.nombre = "Morales";
        System.out.println(maestro.id + " " + maestro.nombre);


        Model.Maestro maestro2 = new Model.Maestro();
        maestro2.nombre = "Magdiel";
        System.out.println(maestro2.id + " " + maestro2.nombre);


        System.out.println(maestro.id + " " + maestro.nombre);

        Calculadora.ClaseAnidada cal  = new Calculadora.ClaseAnidada();
        cal.mostrarNumero();

        Model.Maestro maestro = new Model.Maestro("Morales","Morales11@gmail.com",4321,"Ingeniero en Software");
        maestro.setTelefono("9211479791");



        //Agregar tutorias
        maestro.addCursoDisponible(new Date(),"13:30");
        maestro.addCursoDisponible(new Date(),"14:30");
        maestro.addCursoDisponible(new Date(),"15:30");
        maestro.addCursoDisponible(new Date(),"20:30");

        /*
        //Listar tutorias

        System.out.println(maestro.getNumPersonal() + " " + maestro.getNombre());
        for( Model.Maestro.TutoriasDisponibles td: maestro.getCursoDisponibles() ){
            System.out.println(td.getFecha() + " " + td.getHora());

        System.out.println(maestro.toString());

        Maestro maestro = new Maestro("Morales","Morales11@gmail.com",4321,"Ingeniero en Software");

        maestro.saludar();

        Usuario usuario = new Maestro("Patricia","pmoreno@uv.mx",1231,"Ingeniero en Informatica");
        usuario.saludar();*/


        maestros.add(new Maestro("Morales","Morales11@gmail.com",4321,"Ingeniero en Software"));
        maestros.add(new Maestro("Javier Pino","Pinomx@uv.mx",465654,"Ingeniero en Sistemas"));
        maestros.add(new Maestro("Magdiel Mercado","mamercado@uv.mx",565664,"Ingeniero en Sistemas"));
        maestros.add(new Maestro("Patricia Moreno","pmoreno@uv.mx",56465464,"Ingeniero en Informatica"));

        estudiantes.add(new Estudiante("Ingrid Sarahi","ingrdbonita@gmail.com","zs22017036"));
        estudiantes.add(new Estudiante("Julio Gutiérrez","juliogm2003@gmail.com","zs22017036"));
        estudiantes.add(new Estudiante("Alexis Yahir","navamoya12@gmail.com","zs22017036"));
        estudiantes.add(new Estudiante("Emilio Jasso","ingrdbonita@gmail.com","zs22017036"));


        mostrarMenu();


        }



    }
