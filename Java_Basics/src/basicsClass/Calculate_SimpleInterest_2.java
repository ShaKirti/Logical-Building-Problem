package basicsClass;

import java.util.Scanner;

public class Calculate_SimpleInterest_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal: ");
        float p = sc.nextFloat();

        System.out.println("Enter rate of principal:");
        float r = sc.nextFloat();

        System.out.println("Enter time:");
        float t = sc.nextFloat();

        float SI = (p*r*t)/100;
        System.out.println("Principal: "+p+" Rate: "+r+" Time: "+t);
        System.out.println("Simple Interest is: "+SI);
    }
}
