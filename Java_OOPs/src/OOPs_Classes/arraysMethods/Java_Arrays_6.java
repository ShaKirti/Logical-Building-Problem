package OOPs_Classes.arraysMethods;

import java.util.Scanner;
class TakingArrayInput{
    void arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int max = 0;
        System.out.println("Enter "+size+" Elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("Maximum element in the given array is: "+max);
    }
}
public class Java_Arrays_6 {
    public static void main(String[] args) {
        System.out.println("******************************************************************************************************");
        System.out.println("Question 1 - Taking array input and check the greater number in the given array in java?");
        TakingArrayInput array = new TakingArrayInput();
        array.arrayInput();


        System.out.println("******************************************************************************************************");
        System.out.println("Question - Array reference in java.");
    }
}
