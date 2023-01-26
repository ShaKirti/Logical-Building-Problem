package OOPs_Classes.arraysMethods;

import java.util.Arrays;
// Array Manipulation concept.
// Find the second largest number in the given array.
public class ArrayQuestion_10 {
    static int findMax(int[] arr) {
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    static int findSecondMax(int[] arr) {
        int maxNum = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxNum) {
                arr[i] = -1;
            }
        }
        int nextMaxNum = findMax(arr);

        return nextMaxNum;
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 8, 12, 15};
        System.out.println("\nMaximum number in the given array "+ Arrays.toString(array)+", is: "+findMax(array));
        System.out.println("\nNext maximum number in the given array "+ Arrays.toString(array)+", is: "+ findSecondMax(array));
    }
}
