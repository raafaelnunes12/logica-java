package estruturarepeticao.para;

import java.util.Scanner;

public class SintaxePara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int qtdNumeros = 10;

        for (int i = 0; i < qtdNumeros; i++){
            System.out.print("Numero " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("Soma " + soma);
        scanner.close();
    }
}
