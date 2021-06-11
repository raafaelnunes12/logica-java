package estruturarepeticao.enquanto;

import java.util.Locale;
import java.util.Scanner;

public class CaldulaMediaEnquanto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Nome: ");
        //String nome = scanner.next();
        //System.out.print("Idade: ");
        int idade = scanner.nextInt();
        double mediaIdade = 0;
        int contador = 0;
        String mensagem = "";

        if (idade < 0){
            mensagem = "inválido";
        }

         while (idade >= 0) {
                mediaIdade = (idade + mediaIdade);
                //nome = scanner.next();
                idade = scanner.nextInt();
                contador++;
                mensagem = "A média das idades é " +  (mediaIdade/contador);
            }
        System.out.printf(mensagem);

        scanner.close();
    }
}
