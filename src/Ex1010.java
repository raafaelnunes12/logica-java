import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    /*
    Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
    o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre
    o valor a ser pago.

    Entrada
    O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois
    inteiros e um valor com 2 casas decimais.

    Saída
    A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os
    dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe o código da peça 01:");
        int codigoPeca1 = scanner.nextInt();

        System.out.println("Informe a quantidade da peça 01:");
        int qtdPeca1 = scanner.nextInt();

        System.out.println("Informe o valor da peça 01:");
        double valorPeca1 = scanner.nextDouble();

        System.out.println("Informe o código da peça 02:");
        int codigoPeca2 = scanner.nextInt();

        System.out.println("Informe a quantidade da peça 02:");
        int qtdPeca2 = scanner.nextInt();

        System.out.println("Informe o valor da peça 02:");
        double valorPeca2 = scanner.nextDouble();

        double valorAPagar = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);

        System.out.printf ("VALOR A PAGAR: R$ %.2f", valorAPagar);

        scanner.close();
    }
}
