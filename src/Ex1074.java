import java.util.Scanner;

public class Ex1074 {
    /*
    Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida.
    Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN),
    ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0),
    embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.

    Entrada
    A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste.
    Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

    Saída
    Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo.
    Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String tipo1 = "";
        String tipo2 = "";

        for (int i = 0; i < x; i++){
            int n = scanner.nextInt();
            if (n == 0){
                tipo1 = "NULL";
            }
            if (n % 2 == 0 && n != 0){
                tipo1 = "EVEN";
                if (n > 0){
                    tipo2 = "POSITIVE";
                } else {
                    tipo2 = "NEGATIVE";
                }
            } else if (n % 2 != 0 && n != 0) {
                tipo1 = "ODD";
                if (n > 0){
                    tipo2 = "POSITIVE";
                } else {
                    tipo2 = "NEGATIVE";
                }
            }
            System.out.printf("%s %s %n", tipo1, tipo2);
            tipo1 = "";
            tipo2 = "";
        }
        scanner.close();
    }
}
