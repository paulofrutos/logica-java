import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5
(A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Exemplos de Entrada	                Exemplos de Saída
5.0                                 MEDIA = 6.43182
7.1



0.0                                 MEDIA = 4.84091
7.1



10.0                                MEDIA = 10.00000
10.0

 */
public class Ex1005 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double total = (3.5 * A + 7.5 * B) / 11;

        System.out.printf("MEDIA = %.5f%n", total);


        scanner.close();
    }

}