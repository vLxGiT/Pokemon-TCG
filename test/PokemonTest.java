package src;

import org.junit.Test;
import static org.junit.Assert.*;

public class PokemonTest {

    @Test
    public void testConstructorAndGetters() {
        Pokemon pikachu = new Pokemon("Pikachu", "TipoElectrico", 60, "Impacto Trueno");

        assertEquals("Pikachu", pikachu.getNombre());
        assertEquals("TipoElectrico", pikachu.getTipo());
        assertEquals(60, pikachu.getPuntosDeVida());
        assertEquals("Impacto Trueno", pikachu.getHabilidad());
    }

    @Test
    public void testSetters() {
        Pokemon pikachu = new Pokemon("Pikachu", "TipoElectrico", 60, "Impacto Trueno");

        pikachu.setNombre("NuevoPikachu");
        pikachu.setTipo("NuevoTipoElectrico");
        pikachu.setPuntosDeVida(80);
        pikachu.setHabilidad("NuevoImpactoTrueno");

        assertEquals("NuevoPikachu", pikachu.getNombre());
        assertEquals("NuevoTipoElectrico", pikachu.getTipo());
        assertEquals(80, pikachu.getPuntosDeVida());
        assertEquals("NuevoImpactoTrueno", pikachu.getHabilidad());
    }
}
