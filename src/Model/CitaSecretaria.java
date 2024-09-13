package Model;

import java.util.Date;

public class CitaSecretaria extends Secretaria implements IAgendable{
    private int id;
    private Secretaria secretaria;
    private Estudiante estudiante;
    private Date fecha;
    private String hora;

    CitaSecretaria(String nombre, String correo, String turno) {
        super(nombre, correo, turno);
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }


    @Override
    public void agendar(Date fecha, String hora) {

    }

    @Override
    public void saludar() {

    }
}
