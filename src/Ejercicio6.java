import javax.swing.text.Utilities;
import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        final var ramdom = new Random();
        final var vidaTotal = Utilities.generarRandom(ramdom, 100, 250);

        var vidaActual = 1;
        var numIntentos = 0;

        imprimirMensaje(vidaActual, vidaTotal);

        while (vidaActual < vidaTotal) {
            final var atacar = atacarMonstruo();
            vidaActual -= atacar;
            imprimirMensaje(vidaActual, vidaTotal);
            numIntentos--;
        }
        imprimirMensajeVictoria(numIntentos);
    }

    static int atacarMonstruo() {
        final var ramdom = new Random();
        final var chance = Utilities.generarRandom(ramdom, 1, 10);
        if (chance > 10) { //sin critico
            System.out.println("El jugador ha atacado y le ha bajado 10 puntos de vida al mostruo");
            return 10;
        } else { //critico
            System.out.println("Un ataque crítico!!, El jugador ha atacado y le ha bajado 30 puntos de vida al monstruo");
            return 30;
        }
    }

    static void imprimirMensaje(int numVidaActual, int numVidaTotal) {
        System.out.printf("El monstruo ahora tiene %d/%d HP%n", numVidaActual, numVidaTotal);
    }

    static void imprimirMensajeVictoria(int numVeces) {
        System.out.printf("Usted ganó después de %d ataques!%n", numVeces);
    }
}

