package case3;

import java.util.Scanner;

public class case3_10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int h,g,z;
        for (h=1;h<=a;h++){
            for (g=1;g<=a-h;g++){
                System.out.print(" ");
            }
            for(z=1;z<=2*h-1;z++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
