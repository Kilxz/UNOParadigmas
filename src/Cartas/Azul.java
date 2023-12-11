package Cartas;
/**
 * Clase que especializa a la clase abstracta Cartas. Clase dedicada a las cartas de color azul
 * @author Tomas Rando
 * @version 1.0.0
 * @since 21
 */

public class Azul extends Cartas {
    /**
     * Constructor de la clase Azul
     * @param valor Indica el valor de la carta. Int
     * @param especial Indica si es especial o no. Boolean
     * @param tipo Indica que tipo de carta especial es. String
     */
    public Azul(int valor, Boolean especial, String tipo) {
        super("Azul", especial, valor, tipo);
    }  
}