package Jugador;
import Cartas.*;
import java.util.ArrayList;

/**
 * Clase Jugador que modela a un jugador del juego.
 * @author Tomas Rando
 * @version 1.0.0
 * @since 21
 */
public class Jugador {
    private String nombre;
    private int numero;
    private ArrayList<Cartas> mazo = new ArrayList<>();

    /**
     * Constructor de la clase jugador
     * @param nombre String con el nombre del jugador elegido.
     * @param numero Numero del jugador
     */
    public Jugador(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    /**
     * Getter del nombre del jugador
     * @return String con el nombre del jugador
     */
    public String getName() {
        return nombre;
    }
    /**
     * Getter del numero del jugador
     * @return Int con el numero del jugador
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Función que muestra todas las cartas en posesión del jugador
     */
    public void getMazo() {
        System.out.println("======== MAZO DEL JUGADOR ========");
        for (int i = 0; i < mazo.size(); i++) {
            System.out.println(i + " " + mazo.get(i));
        }
        System.out.println("==================================");
    }

    /**
     * Agrega la carta pasada como parametro al mazo del jugador
     * @param carta Carta de cualquier clase
     */
    public void agregarCarta(Cartas carta) {
        mazo.add(carta);
    }

    /**
     * Remueve del mazo la carta presente en la posicion indicada por indice y la coloca en el mazo de jugada general
     * @param indice Entero que indica una posicion del arrayList
     */
    public void quitarCarta(int indice) {
        mazo.remove(indice);
    }
}