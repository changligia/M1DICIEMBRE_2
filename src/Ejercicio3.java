import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var numleido = ScannerManager.leerDouble(scanner, "Ingrese monto en $: ");

        char opcion;

        do {
            mostrarMenu();
            opcion = ScannerManager.leerChar(scanner, "Ingrese opcion: ");
            ejecutarOpcion(opcion, numleido);
            System.out.println("Escriba F para salir del programa ");
        } while (opcion != 'F');
        scanner.close();
    }

    static void mostrarMenu() {
        System.out.println("A: Convertir a soles");
        System.out.println("B: Convertir a euros");
        System.out.println("C: Convertir a yenes");
        System.out.println("D: Convertir a yuan");
        System.out.println("E: Convertir a rupias");
        System.out.println("F: Salir del programa");
    }

    static void ejecutarOpcion(char opcion, double precio) {
        switch (opcion) {
            case 'A':
                calcularSoles(precio);
                break;
            case 'B':
                calcularEuros(precio);
                break;
            case 'C':
                calcularYenes(precio);
                break;
            case 'D':
                calcularYuanes(precio);
                break;
            case 'E':
                calcularRupias(precio);
                break;
            case 'F':
                System.out.println("Salir del Programa");
                break;
            default:
                System.out.println("Opcion Invalida");
        }
    }

    static void calcularSoles(double dolares) {
        final var soles = dolares * 3.90;
        System.out.printf("%.2f USD equivalen a %.2f soles%n", dolares, soles);
    }

    static void calcularEuros(double dolares) {
        final var euros = dolares * 0.99;
        System.out.printf("%.2f%nUSD equivalen a %.2f%neuros%n", dolares, euros);
    }

    static void calcularYenes(double dolares) {
        final var yenes = dolares * 145.66;
        System.out.printf("%.2f USD equivalen a %.2f yenes%n", dolares, yenes);
    }

    static void calcularYuanes(double dolares) {
        final var yuanes = dolares * 7.25;
        System.out.printf("%.2f USD equivalen a %.2f yuanes%n", dolares, yuanes);
    }

    static void calcularRupias(double dolares) {
        final var rupias = dolares * 15.637;
        System.out.printf("%.2f USD equivalen a %.2f rupias%n", dolares, rupias);
    }
}