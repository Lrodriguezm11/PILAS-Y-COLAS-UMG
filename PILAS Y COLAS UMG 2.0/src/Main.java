/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opción:");
        System.out.println("1. Pila");
        System.out.println("2. Cola");
        int option = scanner.nextInt();

        if (option == 1) {
    Stack<Integer> stack = new Stack<>();
    NumerosAleatorios randomNumbers = new NumerosAleatorios();
    int[] numbers = randomNumbers.getNumbers();

    for (int number : numbers) {
        stack.push(number);
    }

    System.out.println("Los números aleatorios son:");
    while (!stack.isEmpty()) {
        System.out.println(stack.pop());
    }
}
        else if (option == 2) {
    Queue<Integer> queue = new LinkedList<>();
    NumerosAleatorios randomNumbers = new NumerosAleatorios();
    int[] numbers = randomNumbers.getNumbers();

    for (int number : numbers) {
        queue.offer(number);
    }

    System.out.println("Los números aleatorios son:");
    while (!queue.isEmpty()) {
        System.out.println(queue.poll());
    }
}

    }
}*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opción:");
        System.out.println("1. Pila");
        System.out.println("2. Cola");
        int option = scanner.nextInt();

        if (option == 1) {
            Stack<Integer> stack = new Stack<>();
            NumerosAleatorios randomNumbers = new NumerosAleatorios();
            int[] numbers = randomNumbers.getNumbers();

            for (int number : numbers) {
                stack.push(number);
            }

            try {
                PrintWriter writer = new PrintWriter("numeros_pila.txt", "UTF-8");
                writer.println("Los números aleatorios en la pila son:");
                while (!stack.isEmpty()) {
                    int number = stack.pop();
                    writer.println(number);
                }
                writer.close();
                System.out.println("Los números aleatorios han sido guardados en el archivo numeros_pila.txt.");
            } catch (IOException e) {
                System.out.println("Error al guardar los números aleatorios en el archivo.");
            }
        } else if (option == 2) {
            Queue<Integer> queue = new LinkedList<>();
            NumerosAleatorios randomNumbers = new NumerosAleatorios();
            int[] numbers = randomNumbers.getNumbers();

            for (int number : numbers) {
                queue.offer(number);
            }

            try {
                PrintWriter writer = new PrintWriter("numeros_cola.txt", "UTF-8");
                writer.println("Los números aleatorios en la cola son:");
                while (!queue.isEmpty()) {
                    int number = queue.poll();
                    writer.println(number);
                }
                writer.close();
                System.out.println("Los números aleatorios han sido guardados en el archivo numeros_cola.txt.");
            } catch (IOException e) {
                System.out.println("Error al guardar los números aleatorios en el archivo.");
            }
        } else {
            System.out.println("Opción inválida. Por favor seleccione una opción válida.");
        }
    }
}
