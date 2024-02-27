package src;

import org.junit.Test;
import static org.junit.Assert.*;

public class CartaTest {

    @Test
    public void testConstructorAndGetters() {
        Carta carta = new Carta("Carta1", "Tipo1");

        assertEquals("Carta1", carta.getNombre());
        assertEquals("Tipo1", carta.getTipo());
    }

    @Test
    public void testSetters() {
        Carta carta = new Carta("Carta1", "Tipo1");

        carta.setNombre("NuevaCarta");
        carta.setTipo("NuevoTipo");

        assertEquals("NuevaCarta", carta.getNombre());
        assertEquals("NuevoTipo", carta.getTipo());
    }
}
