package src.DEC17.LAB001;

import java.util.Scanner;

public class lab004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x");
        double x= sc.nextDouble();
        System.out.println("Enter the y");
        double y= sc.nextDouble();
        System.out.println("Enter the z");
        double z= sc.nextDouble();

        double result =0;

        result=Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);
        sc.close();


    }

}
