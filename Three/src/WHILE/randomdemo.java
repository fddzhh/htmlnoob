package WHILE;

import java.util.Random;

public class randomdemo {
    public static void main(String[] args) {
        //创建对象
        Random r =new Random();

        //用循环获得10个随机数
        for (int i =0;i<10;i++){
            int number= r.nextInt(10);
            System.out.println("number:"+number);
        }
        int x= r.nextInt(100)+1;
        System.out.println(x);
    }
}
