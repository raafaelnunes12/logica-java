import java.util.Scanner;

public class Saudacao {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe a hora e minutos");
            int hora = scanner.nextInt();
            int minuto = scanner.nextInt();

            if (hora > 24 || minuto > 60){
                System.out.print("Hora inválida");
            } else {

                if (hora < 12){
                System.out.print("Bom dia!");
            } if (hora >= 12 && hora < 18 ){
                System.out.print("Boa tarde!");
            } if (hora > 18) {
                System.out.print("Boa noite!");
            }
            scanner.close();
                    }
                }
            }




