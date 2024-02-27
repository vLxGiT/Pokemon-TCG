package src;
public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", 60, "Impacto Trueno");
        Energia energiaElectrica = new Energia("Energía Eléctrica", "Energía", "Eléctrica");
        Entrenador entrenador = new Entrenador("Profesor Oak", "Entrenador", "Roba 7 cartas", "Permite al jugador robar 7 cartas del mazo");

        // Mostrar información de las cartas
        System.out.println("Información de Pikachu:");
        System.out.println("Nombre: " + pikachu.getNombre());
        System.out.println("Tipo: " + pikachu.getTipo());
        System.out.println("Puntos de Vida: " + pikachu.getPuntosDeVida());
        System.out.println("Habilidad: " + pikachu.getHabilidad());

        System.out.println("\nInformación de la Energía Eléctrica:");
        System.out.println("Nombre: " + energiaElectrica.getNombre());
        System.out.println("Tipo: " + energiaElectrica.getTipo());
        System.out.println("Tipo de Energía: " + energiaElectrica.getTipoEnergia());

        System.out.println("\nInformación del Entrenador:");
        System.out.println("Nombre: " + entrenador.getNombre());
        System.out.println("Tipo: " + entrenador.getTipo());
        System.out.println("Objetivo: " + entrenador.getObjetivo());
        System.out.println("Efecto: " + entrenador.getEfecto());
    }
}
