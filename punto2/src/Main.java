import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Crear jugadores
        Jugador jugador1 = new Jugador("Mbappe", 28);
        Jugador jugador2 = new Jugador("Ronaldo", 36);
        Jugador jugador3 = new Jugador("Neymar", 29);

        // Crear equipo de fútbol
        List<Jugador> jugadoresEquipo = new ArrayList<>();
        jugadoresEquipo.add(jugador1);
        jugadoresEquipo.add(jugador2);
        jugadoresEquipo.add(jugador3);

        EquipoFutbol equipo = new EquipoFutbol("Portugal", "Portugal", jugadoresEquipo);

        // Mostrar información del equipo
        equipo.mostrarInformacion();
    }

    }
