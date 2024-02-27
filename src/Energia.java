package src;
public class Energia extends Carta {
    private String tipoEnergia;

    public Energia(String nombre, String tipo, String tipoEnergia) {
        super(nombre, tipo);
        this.tipoEnergia = tipoEnergia;
    }

    // Getters y setters
    public String getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(String tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }
}
