package case3;


public class case3_12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int z = 1; z <= 10; z++) {
                if (z == 10 || z == 1) {
                    System.out.print("以售 ");
                    continue;
                }
                System.out.print("可售 ");
            }
            System.out.println();
        }

    }
}