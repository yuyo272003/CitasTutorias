package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CitaTutoria {
    private int id;
    private Date fecha;
    private String hora;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");


    public CitaTutoria(String fecha, String hora) {
        try {
            this.fecha = formato.parse(fecha);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha(Date fecha) {
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

    public  String getFecha(){
        return formato.format(fecha);
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Hora: " + hora + "\n";
    }
}
