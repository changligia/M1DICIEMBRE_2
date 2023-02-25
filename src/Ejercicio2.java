import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        int numLeido;

        do {
            numLeido = ScannerManager.leerInteger(scanner, "Ingrese numero: ");
            calcularPromedio(numLeido);
            System.out.println("Escriba -1 para salir del programa");
        } while (numLeido != -1);
        scanner.close();
        imprimirMensajeDespedida();
    }

    static void calcularPromedio(int n) {
        var suma = n;
        for (var i = 1; i < n; i++) {
            suma += i; //acumula la suma
        }
        System.out.printf("El promedio simple desde 1 hasta %d%n es %d%n", n, suma / n);
    }

    static void imprimirMensajeDespedida() {
        System.out.println("Hasta luego primito");
    }
}