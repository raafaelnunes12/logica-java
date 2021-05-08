import java.util.Locale;

public class Formatacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double x = 10.35784;

        // Imprimi valor com formatação
        System.out.printf("%.2f%n", x);
    }
}
