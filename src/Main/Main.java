package Main;
import Tablero.*;
import Jugador.*;
import Cartas.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido, ingrese el número de jugadores: ");
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        int stop = 0;
        while (stop == 0)
        try {
            option = scanner.nextInt();
            if ((option < 2) || (option > 9)) {
                System.out.println("La cantidad mínima de jugadores es 2 y la máxima 9. Gracias por utilizar.");
                stop = 1;
            } else {
                stop = 2;
            }
        } catch (InputMismatchException e1) {
            System.out.println("La opción ingresada no es correcta. Intente nuevamente");
        }

        ArrayList<String> jugadores = new ArrayList<>();
        String name;
        scanner.nextLine();
        if (stop == 2) {
            for (int i = 0; i < option; i++) {
                System.out.println("Ingrese nombre de jugador " + (i + 1));
                name = scanner.nextLine();
                jugadores.add(name);
                System.out.println(name);
            }
        }

        Tablero tablero = new Tablero(jugadores);
        }

        public void jugar(Tablero tablero) {
            System.out.println("======== INICIO ========");
            int stop = 0;
            Scanner scanner = new Scanner(System.in);
            int option;
            Jugador jugadorActual;
            ArrayList<Jugador> players = tablero.getJugadores();
            while (stop == 0) {
                for (int i = 0; i < tablero.getJugadores().size(); i++) {
                    jugadorActual = players.get(i);
                    option = menu(jugadorActual, tablero);
                    

                }
            }
        }

        public int menu(Jugador jugadorActual, Tablero tablero) {
            Scanner scanner = new Scanner(System.in);
            int option = 0;
            int cartaSeleccionada = -1;
            Cartas cartaAct;
            System.out.println("======= Turno de jugador " + jugadorActual.getName() + "=======" );
            System.out.println("1. Mostrar cartas");
            System.out.println("2. Jugar carta");
            System.out.println("3. Pasar");
            
        
            while (option < 1 || option > 3) {
                option = scanner.nextInt();
            }
            scanner.nextLine();
            switch (option) {
                case 1: 
                    jugadorActual.getMazo();
                    menu(jugadorActual, tablero);
                    break;
                case 2:
                    jugadorActual.getMazo();
                    while (cartaSeleccionada < 0 || cartaSeleccionada >= jugadorActual.getMazoJugador().size()) {
                        cartaSeleccionada = scanner.nextInt();
                    }
                    cartaAct = jugadorActual.quitarCarta(cartaSeleccionada);
                    
                case 3:
                    jugadorActual.agregarCarta(tablero.getCartaMazo());
                    break;
                default:
                    break;
                }
            return option;
        }
    }
