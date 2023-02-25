import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        int opcion = 0;

        do {
            final var numleido = ScannerManager.leerInteger(scanner, "Escriba un numero: ");
            if (numleido >= 1 && numleido <= 50) {
                final var resultado = calcularFactorial(numleido);
                imprimirResultado(numleido, resultado);
            } else {
                System.out.println("Favor, ingresar un número entre 5 y 10");
            }

        } while (opcion != -1);
        scanner.close();
    }

    static int calcularFactorial(int n) {
        var factorial = 1;
        for (var i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static void imprimirResultado(int num1, int num2) {
        System.out.printf("El factorial de %d es %d%n", num1, num2);
    }
}
