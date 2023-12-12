package Tablero;
import Cartas.*;
import Jugador.*;
import java.util.ArrayList;
import java.util.Random;

public class Tablero {
    private Cartas cartaActual;
    private ArrayList<Cartas> mazo = new ArrayList<>();
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    
    public Tablero(ArrayList<String> jugadorList) {
        ArrayList<Cartas> mazoAux = new ArrayList<>();

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 10; i++) {
                Roja cartaR = new Roja(i, false, "N");
                Azul cartaA = new Azul(i, false, "N");
                Verde cartaV = new Verde(i, false, "N");
                Amarillo cartaAm = new Amarillo(i, false, "N");
                mazoAux.add(cartaR);
                mazoAux.add(cartaA);
                mazoAux.add(cartaV);
                mazoAux.add(cartaAm);
            }
        }

        for (int j = 0; j < 2; j++) {
            Roja cartaR = new Roja(-1, true, "+2");
            Azul cartaA = new Azul(-1, true, "+2");
            Verde cartaV = new Verde(-1, true, "+2");
            Amarillo cartaAm = new Amarillo(-1, true, "+2");
            Roja cartaR1 = new Roja(-1, true, "Inversa");
            Azul cartaA1 = new Azul(-1, true, "Inversa");
            Verde cartaV1 = new Verde(-1, true, "Inversa");
            Amarillo cartaAm1 = new Amarillo(-1, true, "Inversa");
            mazoAux.add(cartaR);
            mazoAux.add(cartaA);
            mazoAux.add(cartaV);
            mazoAux.add(cartaAm);
            mazoAux.add(cartaR1);
            mazoAux.add(cartaA1);
            mazoAux.add(cartaV1);
            mazoAux.add(cartaAm1);
        }

        for (int j = 0; j < 4; j++) {
            Especial cambioColor = new Especial("Cambio de Color");
            Especial masCuatro = new Especial("+4");
            mazoAux.add(cambioColor);
            mazoAux.add(masCuatro);
        }
        mezclarMazo(mazoAux);

        for (int i = 0; i < jugadorList.size(); i++) {
            Jugador player = new Jugador(jugadorList.get(i), i);
            this.jugadores.add(player);
        }

        this.cartaActual = mazo.get(0);
        this.mazo.remove(0);
        this.insertarMazo(cartaActual);

        Jugador jugadorAux;

        for (int i = 0; i < jugadores.size(); i++) {
            jugadorAux = jugadores.get(i);
            for (int j = 0; j < 7; j++) {
                jugadorAux.agregarCarta(mazo.get(0));
                mazo.remove(0);
            }
        }

    }

    public void mezclarMazo(ArrayList<Cartas> mazoA) {
        Random random = new Random();
        int len = mazoA.size();
        for (int i = 0; i < len; i++) {
            int numeroRandom = random.nextInt(mazoA.size());
            this.mazo.add(mazoA.get(numeroRandom));
            mazoA.remove(numeroRandom);
        }
    }

    public void insertarMazo(Cartas carta) {
        Random random = new Random();
        int numeroRandom = random.nextInt(this.mazo.size());
        this.mazo.add(numeroRandom, carta);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void CartaActual() {
        if (cartaActual.getColor() == "Negro") {
            System.out.println("La primer carta es un " + cartaActual.getTipo());
        } else {
            if (cartaActual.getEspecial() == true) {
                System.out.println("La primer carta es un " + cartaActual.getTipo() + cartaActual.getColor());
            } else {
                System.out.println("La primer carta es un " + cartaActual.getValor() + cartaActual.getColor());
            }
        }
    }

    public Cartas getCartaActual() {
        return cartaActual;
    }

    public void setCartaActual(Cartas carta) {
        this.cartaActual = carta;
    }

    public Cartas getCartaMazo() {
        Cartas cartaAux = mazo.get(0);
        mazo.remove(0);
        return cartaAux;
    }

    public void printMazo() {
        Cartas carta;
        for (int i = 0; i < mazo.size(); i++) {
            carta = mazo.get(i);
            System.out.println(carta.getValor() + carta.getColor() + carta.getTipo());
        }
    }
    
}
