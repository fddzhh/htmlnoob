package case3;

public class case3_11 {
    public static void main(String[] args) {
        int f=0;
        zr:for (int i=1;i<=8;i++) {
            for (int z = 1; z <= 8; z++) {
                f++;
                if (i == 2 && z == 5) {
                    break zr;
                }
                System.out.println(i + "排" + z + "列" + f);
            }
        }
    }
}

