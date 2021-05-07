import java.util.Scanner;

public class TrabalhandoComTexto {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Informe sua idade");
        int idade = scanner.nextInt();

        String imprimeMensagem = "Seja bem vindo " + nome + " você tem " + idade + " anos!";

        System.out.println(imprimeMensagem);

        scanner.close();
    }
}
