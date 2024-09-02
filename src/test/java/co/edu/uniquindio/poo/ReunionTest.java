package co.edu.uniquindio.poo;

public class ReunionTest {
    private static final Logger LOG = Logger.getLogger(ReunionTest.class.getName());

    @Test
    public void testAgregarAsistente() {
        LOG.info("Iniciando test testAgregarAsistente");

        
        Reunion reunion = new Reunion("Reunión de Proyecto", "Discusión del avance del proyecto", 15, 9, 2024, 10);
        Contacto contacto1 = new Contacto("Maria Fernanda", "Mafe", "Calle 12-22N", "837427490012", "Mafe01@gmail.com");
        Contacto contacto2 = new Contacto("Ana López", "AL", "Calle 456", "55556783734", "ana.lopez@mail.com");

       
        reunion.agregarAsistente(contacto1);
        reunion.agregarAsistente(contacto2);

   
        assertTrue(reunion.getAsistentes().contains(contacto1));
        assertTrue(reunion.getAsistentes().contains(contacto2));

        LOG.info("Finalizando test testAgregarAsistente");
    }

    @Test
    public void testRemoverAsistente() {
        LOG.info("Iniciando test testRemoverAsistente");

       
        Reunion reunion = new Reunion("Reunión de Proyecto", "Discusión del avance del proyecto", 15, 9, 2024, 10);
        Contacto contacto1 = new Contacto("Ana López", "AL", "Calle 456", "55556783734", "ana.lopez@mail.com");

 
        reunion.agregarAsistente(contacto1);
        reunion.removerAsistente(contacto1);

      
        assertFalse(reunion.getAsistentes().contains(contacto1));

        LOG.info("Finalizando test testRemoverAsistente");
    }
}
