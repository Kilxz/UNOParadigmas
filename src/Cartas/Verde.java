package Cartas;
/**
 * Clase que especializa a la clase abstracta Cartas. Clase dedicada a las cartas de color verde
 * @author Tomas Rando
 * @version 1.0.0
 * @since 21
 */

public class Verde extends Cartas {
    /**
     * Constructor de la clase Verde
     * @param valor Indica el valor de la carta. Int
     * @param especial Indica si es especial o no. Boolean
     * @param tipo Indica que tipo de carta especial es. String
     */
    public Verde(int valor, Boolean especial, String tipo) {
        super("Verde", especial, valor, tipo);
    }  
}