package basicsClass;

import java.util.Scanner;

public class If_Else_Switch_4{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
//
//        if (num%2==0) {
//            if (num<10)
//                System.out.println("Number is less than 10.");
//            System.out.println("Number is even.");
//        }
//        else
//            System.out.println("Number is odd.");


        // Using ternary operator
        /*String ans;
        ans = (num%2==0) ? "even" : "odd";
        System.out.println(ans);

         */

//        Write a program to print the value if it is even and divisible by 3.
        if (num%2==0 && num%3==0)
            System.out.println("Number is even and divisible by 3.");
        else if (num%2==0)
            System.out.println("Number is even but not divisible by 3.");
         else
            System.out.println("Number is odd.");

//         Write a program to print the value if it is divisible by 3 or 5.
        if (num%3==0 && num%5==0)
            System.out.println("Number is divisible by 3 & 5.");
        else
            System.out.println("Number is odd.");








//        SWITCH CASE
        int weak;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter a num for weak between 1 to 7: ");
        weak = sc2.nextInt();
        switch (weak){
            case 1->System.out.println("Monday");
            case 2->System.out.println("Tuesday");
            case 3->System.out.println("Wednesday");
            case 4->System.out.println("Thursday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("Saturday");
            case 7->System.out.println("Sunday");
            default -> System.out.println("Invalid day number.");
        }
    }
}