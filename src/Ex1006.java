import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.


Exemplos de Entrada	                Exemplos de Saída
5.0                                 MEDIA = 6.3
6.0
7.0

5.0                                 MEDIA = 9.0
10.0
10.0


10.0                                MEDIA = 7.5
10.0
5.0
 */
public class Ex1006 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double total = (2 * A + 3 * B+ 5 * C) / 10;

        System.out.printf("MEDIA = %.1f%n", total);

        scanner.close();

    }

}