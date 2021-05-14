import java.util.Locale;
import java.util.Scanner;

public class Ex1004 {
    /*
    Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua
    esta operação à variável PROD.
    A seguir mostre a variável PROD com mensagem correspondente.

    Entrada
    O arquivo de entrada contém 2 valores inteiros.

    Saída
    Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e
    depois da igualdade. Não esqueça de imprimir o fim de linha após o produto, caso contrário seu
    programa apresentará a mensagem: “Presentation Error”
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe o valor 1:");
        int valor1 = scanner.nextInt();

        System.out.println("Informe o valor 2:");
        int valor2 = scanner.nextInt();

        int produto = valor1 * valor2;

        System.out.printf("PROD = %d",produto);
    }
}
