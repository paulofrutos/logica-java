import java.util.Locale;
import java.util.Scanner;
public class Saudacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int horaAtual = scanner.nextInt();
        if (horaAtual < 12 && horaAtual > 5) {
            System.out.println("Bom Dia!");
        }else if (horaAtual >= 12 && horaAtual <= 18){
            System.out.println("Boa Tarde");

        }else{
            System.out.println("Boa Noite");
        }
        scanner.close();
    }

}
