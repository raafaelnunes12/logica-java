import java.util.Locale;
import java.util.Scanner;

public class Ex1007 {

    /*
    Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B
    pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

    Entrada
    O arquivo de entrada contém 4 valores inteiros.

    Saída
    Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo,
    com um espaço em branco antes e depois da igualdade.
     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor A:");
        int valorA = scanner.nextInt();
        System.out.println("Informe o valor B:");
        int valorB = scanner.nextInt();
        System.out.println("Informe o valor C:");
        int valorC = scanner.nextInt();
        System.out.println("Informe o valor D:");
        int valorD = scanner.nextInt();

        int diferenca = ((valorA * valorB) - (valorC * valorD));
        System.out.printf("DIFERENCA = %d",diferenca);


    }
}
