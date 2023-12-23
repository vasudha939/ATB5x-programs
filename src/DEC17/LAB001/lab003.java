package src.DEC17.LAB001;

import java.util.Scanner;

public class lab003 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 20) {
            System.out.println("True");
        } else if (number < 20) {
            System.out.println("False");
        } else{
            System.out.println("End");
        }
    }9
}
