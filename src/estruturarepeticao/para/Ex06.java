package estruturarepeticao.para;

public class Ex06 {
    public static void main(String[] args) {
        int x = 8;
        int y = 3;

        for (int i = 0; y < x; i++){
            x = x - 2;
            y = y + i;
            System.out.println(i);

        }
    }
}
