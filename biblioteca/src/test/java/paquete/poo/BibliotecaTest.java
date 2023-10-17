package paquete.poo;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.*;

public class BibliotecaTest {

    private static final Logger LOG = Logger.getLogger(BibliotecaTest.class.getName());

    @Test
    public void verificarGuardarDatos() {
        LOG.info("Inicio de prueba Curso datos...");
        Bibioteca bibioteca = new Bibioteca("La UQ", "123");
        assertEquals("LA UQ ", bibioteca.getNombre());

        LOG.info("Fin prueba BibliotecaMasLibros...");

    }

}
