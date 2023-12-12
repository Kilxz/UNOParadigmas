package Cartas;

/**
 * Clase que especializa a la clase abstracta Cartas. Clase dedicada a las cartas especiales
 * @author Tomas Rando
 * @version 1.0.0
 * @since 21
 */

public class Especial extends Cartas {
    /**
     * Constructor de la clase Especial
     * @param especial Indica si es especial o no. Boolean
     * @param tipo Indica que tipo de carta especial es. String
     */
    public Especial(String tipo) {
        super("Negro", true, -1, tipo);
    }  
}