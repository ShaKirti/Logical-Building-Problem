package basicsClass;

import java.util.Scanner;

public class Prob_Loop_7 {
    public static void main(String[] args) {
        System.out.println("Question 1 - Count the number of digits for a given number n?");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = sc1.nextInt();
        int numOfDigits = 0, numBeforeDivision_1 = num1;
        while(num1 >0){
            num1 = num1 / 10;
            numOfDigits++;
        }
        System.out.println("Number of digits in "+numBeforeDivision_1+" is: "+numOfDigits);


        System.out.println("***********************************------------------------------------------**********************************");
        System.out.println("Question 2 - Find the sum of digits in a given number n?");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num2 = sc2.nextInt();
        int sumOfDigits = 0, numBeforeDivision_2 = num2;

        while (num2>0){
            sumOfDigits += num2 % 10;
            num2 = num2 / 10;
        }
        System.out.println("Sum of digits in "+numBeforeDivision_2+" is: "+sumOfDigits);


        System.out.println("***********************************------------------------------------------**********************************");
        System.out.println("Question 3 - Reverse the digits of a given number?");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num3 = sc3.nextInt();
        int numBeforeDivision_3 = num3, preNumber = 0;

        while (num3>0){
            preNumber = preNumber*10 + num3 % 10;
            num3 /= 10;
        }
        System.out.println("Reversed of the given number "+numBeforeDivision_3+" is: "+preNumber);


        System.out.println("***********************************------------------------------------------**********************************");
        System.out.print("Question 4 - Find the sum of the given series- ");
        System.out.println(" sum = 1 - 2 + 3 - 4 ....n");
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num4 = sc4.nextInt();

        int result = 0;
        int i = 1;
        while (i<=num4){
            if (i % 2 == 0){
                result -= i;
            }
            else {
                result += i;
            }
            i++;
        }
        System.out.println("Sum of the given series is: "+result);


        System.out.println("***********************************------------------------------------------**********************************");
        System.out.println("Question 5 - Print the first n factorial numbers?");
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num5 = sc5.nextInt();
        int fact=1;
        for (int j = 1; j<=num5; j++){
            fact = fact * i;
            System.out.println("Factorial of "+j+" is: "+fact);
        }
    }
}
