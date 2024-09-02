package co.edu.uniquindio.poo;

public class Concesionario{
    private String placa;
    private String marca;
    private String modelo;
    private int precio;

    public void carro (String placa, String marca, String modelo, int precio) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        assert !placa.isBlank();
        assert !marca.isBlank();
        assert !modelo.isBlank();
        assert precio>0;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Concesionario [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
