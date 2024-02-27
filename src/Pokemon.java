package src;
public class Pokemon extends Carta {
    private int puntosDeVida;
    private String habilidad;

    public Pokemon(String nombre, String tipo, int puntosDeVida, String habilidad) {
        super(nombre, tipo);
        this.puntosDeVida = puntosDeVida;
        this.habilidad = habilidad;
    }

    // Getters y setters
    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
}
