import java.util.Locale;
import java.util.Scanner;

public class CalculaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Locale.setDefault(Locale.US);

        System.out.print("Informe a base: ");
        double base = scanner.nextDouble();

        System.out.print("Informe a altura: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = (2 * base) + (2 * altura);
        double diagonal = Math.sqrt((base * base)+(altura * altura));

        System.out.printf("--------------------------%n");
        System.out.printf("Área: %.4f%n", area);
        System.out.printf("Perimetro: %.4f%n", perimetro);
        System.out.printf("Diagonal: %.4f%n", diagonal);
        System.out.printf("--------------------------");

        scanner.close();
    }
}
