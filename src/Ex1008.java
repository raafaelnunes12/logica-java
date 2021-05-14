import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {

    /*
    Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
    o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número
    e o salário do funcionário, com duas casas decimais.

    Entrada
    O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número,
    quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

    Saída
    Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e
    depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número do funcionário:");
        int numeroFuncionario = scanner.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas:");
        int horasTrabalhadas = scanner.nextInt();
        System.out.println("Informe o valor da hora do funcionario(" + numeroFuncionario +")");
        double valorHora = scanner.nextDouble();

        double totalHoras = horasTrabalhadas*valorHora;

        System.out.printf("NUMBER = %d%n",numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f",totalHoras);



    }
}
