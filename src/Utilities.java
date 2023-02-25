import java.util.Random;

public class Utilities {
    static int generarRandom(Random random, int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
