package OOPs_Classes.arraysMethods;

import java.util.Scanner;

class Addition{
    //    int x;
//    int y;
//    Addition(int a,int b){
//        System.out.println("Constructor of a main class is called");
//        a=x;
//        b=y;
//    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int y = sc.nextInt();
        int result = x+y;
        return result;
    }
}
public class JavaMethods_2 {
    public static void main(String[] args) {
        System.out.println("Hello");

//        Addition num = new Addition(14,69);
//        System.out.println(num.sum(12,25));
//        System.out.println("Result of sum is: "+num.sum());
//
        System.out.println("Result of sum is: "+Addition.sum());
    }
}
