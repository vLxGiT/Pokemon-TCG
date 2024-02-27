package src;

import org.junit.Test;
import static org.junit.Assert.*;

public class EnergiaTest {

    @Test
    public void testConstructorAndGetters() {
        Energia energiaElectrica = new Energia("EnergiaElectrica", "TipoEnergia", "Electrica");

        assertEquals("EnergiaElectrica", energiaElectrica.getNombre());
        assertEquals("TipoEnergia", energiaElectrica.getTipo());
        assertEquals("Electrica", energiaElectrica.getTipoEnergia());
    }

    @Test
    public void testSetters() {
        Energia energiaElectrica = new Energia("EnergiaElectrica", "TipoEnergia", "Electrica");

        energiaElectrica.setNombre("NuevaEnergiaElectrica");
        energiaElectrica.setTipo("NuevoTipoEnergia");
        energiaElectrica.setTipoEnergia("NuevoElectrica");

        assertEquals("NuevaEnergiaElectrica", energiaElectrica.getNombre());
        assertEquals("NuevoTipoEnergia", energiaElectrica.getTipo());
        assertEquals("NuevoElectrica", energiaElectrica.getTipoEnergia());
    }
}
