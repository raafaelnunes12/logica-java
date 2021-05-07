import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Informe sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Informe seu peso");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println(nome + " seu imc é de: " + imc);

        scanner.close();
    }
}
