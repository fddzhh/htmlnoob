package case3;


import java.util.Scanner;

public class case3_01 {
    public static void main(String[] args) {
        System.out.println("请输入数字");
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        if (f % 2 == 0) {
            System.out.println("为偶数");
        } else{
            System.out.println("为奇数");
    }
    }
}