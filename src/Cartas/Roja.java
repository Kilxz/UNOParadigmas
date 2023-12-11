package Cartas;
/**
 * Clase que especializa a la clase abstracta Cartas. Clase dedicada a las cartas de color rojo
 * @author Tomas Rando
 * @version 1.0.0
 * @since 21
 */

public class Roja extends Cartas {
    /**
     * Constructor de la clase Roja
     * @param valor Indica el valor de la carta. Int
     * @param especial Indica si es especial o no. Boolean
     * @param tipo Indica que tipo de carta especial es. String
     */
    public Roja(int valor, Boolean especial, String tipo) {
        super("Rojo", especial, valor, tipo);
    }  
}
