package estruturarepeticao.para;

import java.util.Scanner;

public class ExUri1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            int produto = i * n;
            System.out.println(i + " X " + n + " = "+ produto);

        }
        scanner.close();
    }
}
