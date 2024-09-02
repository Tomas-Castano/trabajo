package co.edu.uniquindio.poo;

public class ContactoTest {
    private static final Logger LOG = Logger.getLogger(ContactoTest.class.getName());

 @Test
    public void verificacionCorreo() {
        LOG.info("Iniciado test validacionCorreo");

        assertThrows(Throwable.class, ()-> new Contacto("Maria Fernanda","Mafe","Calle 12-22N","837427490012","Mafe01@gmail.com"));

        LOG.info("Finalizando test validacionCorreo");

    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");

        assertThrows(Throwable.class, ()-> new Contacto("","","","",""));

        LOG.info("Finalizando test datosVacios");
    }


    @Test
    public void ContactoDuplicadoNombre() {
        LOG.info("Iniciando test ContactoDuplicadoNombre");

        GestorContactos gestor = new GestorContactos();
        

        Contacto contacto1 = new Contacto("Maria Fernanda", "Mafe", "Calle 12-22N", "837427490012", "Mafe01@gmail.com");
        gestor.agregarContacto(contacto1);

        Contacto contactoDuplicadoNombre = new Contacto("Maria Fernanda", "Mar", "Calle 456", "3846109345", "Mar22@gmail.com");
       
        boolean agregado = gestor.agregarContacto(contactoDuplicadoNombre);
        assertFalse(agregado, "No se permite agregar un contacto con el mismo nombre");

        LOG.info("Finalizando test ContactoDuplicadoNombre");
    }
}

    @Test
    public void DuplicadoPorTelefono() {
        LOG.info("Iniciando test NoDuplicadoTelefono");

        GestorContactos gestor = new GestorContactos();

   
        Contacto contacto1 = new Contacto("Maria Fernanda", "Mafe", "Calle 12-22N", "837427490012", "Mafe01@gmail.com");
        gestor.agregarContacto(contacto1);

    
        Contacto contactoConMismoTelefono = new Contacto("Ana López", "AL", "Calle 456", "837427490012", "ana.lopez@mail.com");

      
        assertFalse(gestor.agregarContacto(contactoConMismoTelefono));

        LOG.info("Finalizando test testNoDuplicadoPorTelefono");
    }
}