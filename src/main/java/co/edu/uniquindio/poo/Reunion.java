package co.edu.uniquindio.poo;

public class Reunion{
    private String nombre;
    private String descripcion;
    private int dia;
    private int mes;
    private int año;
    private int hora;

    public Reunion (String nombre, String descripcion, int dia, int mes, int año, int hora) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        assert !nombre.isBlank();
        assert dia != 0;
        assert mes != 0;
        assert año != 0;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Reunion [nombre=" + nombre + ", descripcion=" + descripcion + ", dia=" + dia + ", mes=" + mes + ", año="
                + año + ", hora=" + hora + "]";
    }
}