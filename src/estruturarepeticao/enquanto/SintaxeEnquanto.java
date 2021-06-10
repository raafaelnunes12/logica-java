package estruturarepeticao.enquanto;

import java.util.Scanner;

public class SintaxeEnquanto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int soma = 0;

        while (numero != 0){
            soma = soma + numero;
            numero = scanner.nextInt();
            System.out.println(numero);
        }
        System.out.println("A soma é " + soma);
        scanner.close();
    }
}
