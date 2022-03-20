package anli;
import java.util.Scanner;

public class case2_07 {
    public static void main(String[] args) {
       // int a ,b , c;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个和尚身高：");
       int a = sc.nextInt();
        System.out.println("输入第二个和尚身高：");
       int b = sc.nextInt();
        System.out.println("输入第三个和尚身高：");
       int c = sc.nextInt();
        int d=a>b?a:b;
        int f=b>c?b:c;
        System.out.println("最高身高是："+f);
    }
}
