package Model;

import java.util.Date;

public class CitaMaestro extends Maestro implements IAgendable{
    private int id;
    private Maestro maestro;
    private Estudiante estudiante;
    private Date fecha;
    private String hora;

    public CitaMaestro(String nombre, String correo, int numPersonal, String especialidad) {
        super(nombre, correo, numPersonal, especialidad);
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }



    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }


    @Override
    public void agendar(Date fecha, String hora) {

    }

    @Override
    public void saludar() {

    }
}
