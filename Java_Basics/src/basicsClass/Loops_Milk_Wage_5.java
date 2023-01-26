package basicsClass;

import java.util.Scanner;

public class Loops_Milk_Wage_5 {
    public static void main(String[] args) {
        /*for(int i = 1; i<=10; i++){
            System.out.println("Hello World");
        }
         */

  /*      Enter the number to print number of even number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int value = sc.nextInt();
        for (int i = 1; i<=value; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }*/


        System.out.println("Printing pattern-");
        for (int i = 0; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }


//        int num = 1, sum = 0, n;
//        Scanner sc3 = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        n = sc3.nextInt();
//        while(num<n){
//            sum += num;
//            num++;
//            System.out.println(num);
//        }
//        System.out.println(sum);


        System.out.println("Print the sum of the stream of integers in the input?");

        System.out.println("Number of days milk come:");
        int num = new Scanner(System.in).nextInt();

        System.out.println("Price of the milk: ");
        int price = new Scanner(System.in).nextInt();

        System.out.println("how many days you get more milk:");
        int mdays = new Scanner(System.in).nextInt();

        System.out.println("Price on those days when you get more milk:");
        int mprice = new Scanner(System.in).nextInt();

        System.out.println("Payment for milk: " + num * price);
        System.out.println("Extra payment when you get more milk: " + mdays * mprice);

        System.out.println("------------------------------------------------------------------------------");
        int totalPayment = (num * price) + (mdays * mprice);
        System.out.println("Total payment in a month for milk is: " + totalPayment);
        System.out.println("------------------------------------------------------------------------------");
    }
}
