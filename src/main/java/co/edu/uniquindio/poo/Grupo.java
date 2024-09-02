package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Grupo {
    private String nombre;
    private int categoria;
    private static LinkedList<Contacto> contactos;
    private static LinkedList<Reunion> reuniones;

    public Grupo (String nombre, int categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        contactos = new LinkedList<>();
        reuniones = new LinkedList<>();
        assert !nombre.isBlank();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public LinkedList<Contacto> getListaContactos() {
        return contactos;
    }

    public void setListaContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public static void agregarContacto(Contacto contacto) {
        if (validarTelefono(contacto.getTelefono())) {
            Contacto.mostrarMensaje("Este numero telefónico ya está ocupado.");
        }else{
            contactos.add(contacto);
        }
    }

    public static boolean validarTelefono(String telefono) {
        boolean telefonoRepetido = false;
        for (Contacto contacto: contactos) {
            if (contacto.getTelefono().equals(telefono)) {
                telefonoRepetido = true;
            }
        }
        return telefonoRepetido;
    }

    public static void eliminarContacto(Contacto contacto3) {
        for (Contacto contacto: contactos) {
            if (contacto.getTelefono().equals(contacto3)) {
                contactos.remove(contacto);
                break;
            }
        }
    }

    public void actualizarContacto(String email, String alias, String telefono) {
        for (Contacto contacto: contactos) {
            if (contacto.getTelefono().equals(telefono)) {
                contacto.setEmail(email);
                contacto.setAlias(alias);
                break;
            }
        }
    }

    public static void agregarReunion(Reunion reunion) {
        reuniones.add(reunion);
    }
    
    public static void eliminarReunion(Reunion reunion) {
        reuniones.remove(reunion);
    }


    @Override
    public String toString() {
        return "Grupo [nombre= " + nombre + ", categoria= " + categoria + ", contactos= " + contactos + "] \n\n" +reuniones;
    }

    
}
