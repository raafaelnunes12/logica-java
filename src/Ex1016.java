import java.util.Locale;
import java.util.Scanner;

public class Ex1016 {
    /*
    Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y
    sai com velocidade constante de 90 Km/h.

    Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se
    afastar um quilômetro a cada 2 minutos.

    Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa
    distância do outro carro.

    Entrada
    O arquivo de entrada contém um número inteiro.

    Saída
    Imprima o tempo necessário seguido da mensagem "minutos".
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        int velCarroX = 60;
        int velCarroY = 90;

        System.out.println("Informe a distância percorrida (em Km):");
        int distanciaPercorrida= scanner.nextInt();

        double totalDistancia = (60 * distanciaPercorrida) / 30;

        System.out.printf ("%.0f minutos", totalDistancia);

        scanner.close();
    }
}
