package IF;

import java.util.Scanner;

public class Ifdemo_03 {
    public static void main(String[] args) {
        System.out.println("开始");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数（1-7）：");
        int week = sc.nextInt();

        if(week==1){
            System.out.println("为星期一");
        }else if(week==2){
            System.out.println("为星期二");
        }else if(week==3){
            System.out.println("为星期三");
        }else if(week==4){
            System.out.println("为星期四");
        }else if(week==5){
            System.out.println("为星期五");
        }else if(week==6){
            System.out.println("为星期六");
        }else{
            System.out.println("为星期天");
        }
        System.out.println("结束");
    }
}
