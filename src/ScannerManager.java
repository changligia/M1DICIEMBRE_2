import java.util.Scanner;

public class ScannerManager {
    static int leerInteger(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    static double leerDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    static boolean leerBoolean(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextBoolean();
    }

    static String leerString(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    static char leerChar(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.next().charAt(0);
    }
}