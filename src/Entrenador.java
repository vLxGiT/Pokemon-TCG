package src;
public class Entrenador extends Carta {
    private String objetivo;
    private String efecto;

    public Entrenador(String nombre, String tipo, String objetivo, String efecto) {
        super(nombre, tipo);
        this.objetivo = objetivo;
        this.efecto = efecto;
    }

    // Getters y setters
    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }
}
