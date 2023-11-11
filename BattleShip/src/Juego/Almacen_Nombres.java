package Juego;

/**
 *
 * @author keneth
 */

public class Almacen_Nombres {

    private static String nombreJugador1;
    private static String nombreJugador2;

    public Almacen_Nombres() {
    }

    public void setNombres(String nombre1, String nombre2) {
        this.nombreJugador1 = nombre1;
        this.nombreJugador2 = nombre2;
        System.out.println("Nombre del jugador 1: " + nombreJugador1);
        System.out.println("Nombre del jugador 2: " + nombreJugador2);
    }

    public String getNombreJugador1() {
        return nombreJugador1;
    }

    public String getNombreJugador2() {
        return nombreJugador2;
    }
}
