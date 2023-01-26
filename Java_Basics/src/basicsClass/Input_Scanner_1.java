package basicsClass;

import java.util.Scanner;

public class Input_Scanner_1 {
    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = sc.nextInt();

        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("Sum of two entered number is:  "+sum);
    }
}
