package case3;

import java.util.Random;
import java.util.Scanner;

public class case3_13 {
    public static void main(String[] args) {
        System.out.println("请输入数字");

        Random z = new Random();
        int f = z.nextInt(100) + 1;

        while (true) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num < f) {
                System.out.println("你猜小了");
            } else if (num>f) {
                System.out.println("你猜大了");
            } else if(num==f) {
                System.out.println("你猜对了");
                break;
            }
        }
    }

}