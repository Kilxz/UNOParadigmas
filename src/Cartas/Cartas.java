package Cartas;
/**
 * Clase abstracta que contiene los atributos de las cartas que serán especializados por sus subclases posteriormente.
 * @author Tomas Rando
 * @version 1.0.0
 * @since 21
 */

public abstract class Cartas {
    private String color;
    private Boolean especial;
    private int valor;
    private String tipo;

    /**
     * Constructor de la clase Cartas, nunca será utilizado en específico pero sí por sus subclases.
     * @param color Color de la carta como String
     * @param especial Booleano que indica si es especial o no (+4, +2, cambio de color, cambio de sentido)
     * @param valor Entero que indicará el valor de la carta (solo si especial es False)
     * @param tipo String que indicará el tipo de la carta especial (solo si especial es True)
     */
    public Cartas(String color, Boolean especial, int valor, String tipo) {
        this.color = color;
        this.especial = especial;
        this.valor = valor;
        this.tipo = tipo;
    }
    
    /**
     * Getter de color
     * @return String con el color de la carta
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Getter con el booleano de especial
     * @return Boolean que indica si es especial o no
     */
    public Boolean getEspecial() {
        return this.especial;
    }

    /**
     * Getter con el valor de la carta
     * @return Entero con el valor de la carta
     */
    public int getValor() {
        return this.valor;
    }

    /**
     * Getter con el tipo de la carta
     * @return String con el tipo de la carta
     */
    public String getTipo() {
        return this.tipo;
    }
}
