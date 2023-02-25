import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var numleido = ScannerManager.leerInteger(scanner, "Escribe un numero " +
                "enrte 100 y 200: ");

        char opcionLeida;

        do {
            mostrarMenu(numleido);
            opcionLeida = ScannerManager.leerChar(scanner, "Ingrese opcion ");
            ejecutarOpcion(opcionLeida, numleido);

        } while (opcionLeida != -1);
        scanner.close();
    }

    static void mostrarMenu(int opcion) {
        System.out.printf("A: Calcular suma desde 1 hasta %d%n", opcion);
        System.out.printf("B: Calcular multiplicación desde 1 hasta %d%n", opcion);
        System.out.printf("C: Mostrar números desde 1 hasta %d%n", opcion);
        System.out.println("D: Salir del programa");
    }

    static void ejecutarOpcion(char opcion, int numleido) {
        switch (opcion) {
            case 'A':
                sumaSerie(numleido);
                break;
            case 'B':
                multiplicacionSerie(numleido);
                break;
            case 'C':
                imprimirSerie(numleido);
                break;
            case 'D':
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }

    static void sumaSerie(int n) {
        var suma = 0;
        for (var i = 1; i < n; i++) {
            suma += i; //acumula la suma
        }
        System.out.printf("La suma desde 1 hasta %d es %d%n", n, suma);
    }

    static void multiplicacionSerie(int n) {
        var multiplicacion = 1;
        for (var i = 1; i < n; i++) {
            multiplicacion += i; //acumula la multiplicacion
        }
        System.out.printf("La Multiplicacion desde 1 hasta %d es %d%n", n, multiplicacion);
    }

    static void imprimirSerie(int n) {
        for (var i = 0; i <= n; i++) {
            System.out.printf("%d%n", i);
        }
    }
}
