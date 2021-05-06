/*
Suponha um programa que solicita ao usuario 2 numeros
e depois mostra a media dos valores.
 */

import java.util.Scanner;

public class CalculaMediaAritimetica {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo valor");
        double segundoNumero = scanner.nextDouble();;

        double resultado;
        resultado = (primeiroNumero + segundoNumero)/2;

        System.out.println(resultado);
    }
}
