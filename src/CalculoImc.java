import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Informe seu peso: ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.printf("%s seu nível é: Magreza%.2f",nome, imc);
        }
        if (imc >= 18.5 && imc < 24.9){
            System.out.printf("%s seu nível é: Normal %.2f",nome, imc);
        }
        if (imc > 25 && imc < 29.9){
            System.out.printf("%s seu nível é: Sobrepeso %.2f",nome, imc);
        }
        if (imc > 30 && imc < 39.9){
            System.out.printf("%s seu nível é: Obesidade %.2f",nome, imc);
        }
        if (imc > 40) {
            System.out.printf("%s seu nível é: Obesidade Grave%.2f",nome, imc);
        }
        scanner.close();
    }
}
