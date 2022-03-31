package case3;

import java.util.Scanner;

public class case3_02 {
    public static void main(String[] args) {
        System.out.println("请输入分数");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a>=90){
            System.out.println("奖励游戏机");
        }else if(a<90&&a>=80){
            System.out.println("奖励100");
        }else if(a<80&&a>=70){
            System.out.println("奖励50");
        }else{
            System.out.println("没有奖励");
        }
        System.out.println("结束");
    }
}