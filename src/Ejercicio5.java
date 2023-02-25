import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        int opcion = 0;

        do {
            final var numleido = ScannerManager.leerInteger(scanner, "Escriba un numero: ");
            if (numleido > 0) {
                final var inverso = calcularInversa(numleido);
                final var esCapicua = verificarCapicua(numleido, inverso);
                imprimirResultado(numleido, inverso, esCapicua);
            }
        } while (opcion != -1);
        System.out.println("“Favor ingresar un número mayor que 0 ");
        scanner.close();
    }

    static int calcularInversa(int numero) {
        var auxiliar = numero;
        int inverso = 0;
        do {
            var residuo = auxiliar % 10;
            inverso = inverso * 10 + residuo;
            auxiliar = auxiliar / 10;

        } while (auxiliar != 0);
        return inverso;
    }

    static boolean verificarCapicua(int numero, int inverso) {
        return numero == inverso;
    }

    static void imprimirResultado(int numero1, int numero2, boolean numero3) {
        System.out.printf("La inversa de %d es %d y por ende %b capicúa%n", numero1, numero2, numero3);
    }
}

