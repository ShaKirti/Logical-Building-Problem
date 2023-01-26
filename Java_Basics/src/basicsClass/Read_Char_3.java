package basicsClass;

import java.util.Scanner;

public class Read_Char_3 {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender:");
        ch = sc.next().charAt(0);
        System.out.println("Gender is: "+ch);

    }
}