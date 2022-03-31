package case3;
import java.util.Scanner;

public class case3_09 {
    public static void main(String[]args){
        System.out.println("请输入一个整数");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=1,num2=1,z;
        for(int f=2;f<num;f++){
            z=num2;
            num2+=num1;
            num1=z;
        }
        System.out.println(num2);
    }
}
