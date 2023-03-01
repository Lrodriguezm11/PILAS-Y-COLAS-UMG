import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import java.io.PrintWriter;

public class NumerosAleatorios {
    private static final int MAX_NUMBERS = 1000000;
    private int[] numbers;

    public NumerosAleatorios() {
        numbers = new int[MAX_NUMBERS];
        generateRandomNumbers();
    }

    /*private void generateRandomNumbers() {
        for (int i = 0; i < MAX_NUMBERS; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-10000000, 10000001);
            numbers[i] = randomNum;
        }
    }*/
    
    private void generateRandomNumbers() {
    try {
        PrintWriter writer = new PrintWriter("Numeros Aleatorios.txt", "UTF-8");
        for (int i = 0; i < MAX_NUMBERS; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-10000000, 10000001);
            numbers[i] = randomNum;
            writer.println(randomNum);
        }
        writer.close();
    } catch (IOException e) {
        System.out.println("Error al escribir en el archivo: " + e.getMessage());
    }
}


    public int[] getNumbers() {
        return numbers;
    }
}

