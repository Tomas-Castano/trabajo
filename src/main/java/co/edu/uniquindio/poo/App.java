package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Contacto contacto = new Contacto("Juan", "El groso", "M°12", "1929838", "Juagroso@gmail.com");

        Contacto contacto2 = new Contacto("Fabian", "Juancho", "M°18", "29329003", "Fabuan@gmail.com");

        Contacto contacto3 = new Contacto("Jeff", "El baneado", "No recuerdo", "12423423", "Jeffazo@gmail.com");

        Reunion reunion = new Reunion("Junta", "No hay razon", 10, 4, 2024, 12);

        Grupo grupo = new Grupo("Los bellacos", 4);

        Grupo.agregarContacto(contacto);
        Grupo.agregarContacto(contacto2);
        Grupo.agregarContacto(contacto3);
        Grupo.eliminarContacto(contacto3);
        Grupo.agregarReunion(reunion);
        Contacto.mostrarMensaje(grupo.toString());
    }
}
