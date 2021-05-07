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

        if (imc < 18.5) {
            System.out.println(nome + " seu nível é: Magreza: " + imc);
        }
        if (imc > 18.6 && imc < 24.9){
            System.out.println(nome + " seu nível é: Normal " + imc);
        }
        if (imc > 25 && imc < 29.9){
            System.out.println(nome + " seu nível é: Sobrepeso " + imc);
        }
        if (imc > 30 && imc < 39.9){
            System.out.println(nome + " seu nível é: Obesidade " + imc);
        }
        if (imc > 40) {
            System.out.println(nome + " seu nível é: Obesidade Grave" + imc);
        }
        scanner.close();
    }
}
