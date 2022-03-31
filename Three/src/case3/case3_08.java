package case3;

public class case3_08 {
    public static void main(String[] args) {
        for (int z = 100; z <= 999; z++) {
            int a = z % 10;
            int b = z / 10 % 10;
            int c = z / 10 / 10 % 10;

            if (a * a * a + b * b * b + c * c * c == z) {
                System.out.println(z);
            }
        }
    }
}