package OOPs_Classes.arraysMethods;

import java.util.Arrays;
import java.util.Scanner;

// Find the last occurence of an element x in a given array.
public class ArrayQuestion_3 {
    static void printArray(int[] arr, int x){
        // find the last occurence
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                lastIndex = i;
            }
        }
        System.out.println("Last occurence of "+x+" at index in the given array is: "+lastIndex);
    }
    public static void main(String[] args) {
        int[] array = {5, 6, 5, 1, 5};
        System.out.println("Enter a number to find its last occurence in the given array : "+ Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        printArray(array, sc.nextInt());
    }
}
