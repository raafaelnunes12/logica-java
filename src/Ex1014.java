import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    /*
    Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km)
    e o total de combustível gasto (em litros).

    Entrada
    O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida
    (em Km), e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

    Saída
    Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula,
    seguido da mensagem "km/l".
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe a distância total percorrida (em Km)");
        int totalKm = scanner.nextInt();

        System.out.println("Informe o total de combustível gasto (em litros)");
        double totalCombustivel = scanner.nextDouble();

        double consumoMedio = totalKm/totalCombustivel;

        System.out.printf ("%.3f km/l", consumoMedio);

        scanner.close();
    }
}
