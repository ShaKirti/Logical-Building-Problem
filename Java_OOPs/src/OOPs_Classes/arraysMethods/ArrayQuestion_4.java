package OOPs_Classes.arraysMethods;

import java.util.Arrays;
import java.util.Scanner;

// Find the elements in the given array which are strictly greater than the element x.
public class ArrayQuestion_4 {
    static void printArray (int[] arr, int x){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > x){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print("]");
    }

    public static void main (String[] args) {
        int[] array = {5, 6, 5, 1, 5};
        System.out.println("Original array :\n"+ Arrays.toString(array));
        System.out.println("Enter a number to find the elements in the given array which are strictly greater than your number");
        printArray(array, new Scanner(System.in).nextInt());
    }
}