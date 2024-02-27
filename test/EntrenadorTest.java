package src;

import org.junit.Test;
import static org.junit.Assert.*;

public class EntrenadorTest {

    @Test
    public void testConstructorAndGetters() {
        Entrenador entrenador = new Entrenador("Entrenador1", "TipoEntrenador", "Objetivo1", "Efecto1");

        assertEquals("Entrenador1", entrenador.getNombre());
        assertEquals("TipoEntrenador", entrenador.getTipo());
        assertEquals("Objetivo1", entrenador.getObjetivo());
        assertEquals("Efecto1", entrenador.getEfecto());
    }

    @Test
    public void testSetters() {
        Entrenador entrenador = new Entrenador("Entrenador1", "TipoEntrenador", "Objetivo1", "Efecto1");

        entrenador.setNombre("NuevoEntrenador");
        entrenador.setTipo("NuevoTipoEntrenador");
        entrenador.setObjetivo("NuevoObjetivo");
        entrenador.setEfecto("NuevoEfecto");

        assertEquals("NuevoEntrenador", entrenador.getNombre());
        assertEquals("NuevoTipoEntrenador", entrenador.getTipo());
        assertEquals("NuevoObjetivo", entrenador.getObjetivo());
        assertEquals("NuevoEfecto", entrenador.getEfecto());
    }
}
