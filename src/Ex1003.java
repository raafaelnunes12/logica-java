import java.util.Locale;
import java.util.Scanner;

public class Ex1003 {

    /*
    Leia dois valores inteiros, no caso para variáveis A e B.
    A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.

    Entrada
    O arquivo de entrada contém 2 valores inteiros.

    Saída
    Imprima a mensagem "SOMA" com todas as letras maiúsculas,
    com um espaço em branco antes e depois da igualdade seguido pelo valor correspondente à soma de A e B.
    Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor 1:");
        int valor1 = scanner.nextInt();

        System.out.println("Informe o valor 2:");
        int valor2 = scanner.nextInt();

        int soma = valor1 + valor2;

        System.out.printf("SOMA = %d",soma);
        scanner.close();
    }
}
