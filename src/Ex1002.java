import java.util.Locale;
import java.util.Scanner;

/*
    A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
    - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
     */

public class Ex1002 {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double n = 3.14159;

        System.out.println("Informe o raio");
        double raio = scanner.nextDouble();

        double area = n * (raio*raio);

        System.out.printf ("A= %.4f", area);

        scanner.close();
    }
}
