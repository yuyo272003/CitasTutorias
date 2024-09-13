package Model;

public class Secretaria extends Usuario{

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    private String turno;
    private String area;
    private String especialidad;


    Secretaria(String nombre, String correo, String turno) {
        super(nombre, correo);
        this.turno = turno;


    }

    @Override
    public void saludar() {

    }
}
