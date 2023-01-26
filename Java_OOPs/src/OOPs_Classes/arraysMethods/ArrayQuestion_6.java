package OOPs_Classes.arraysMethods;

// Find the smallest and largest number in the given array.

import java.util.Arrays;

public class ArrayQuestion_6 {
    static int[] smallestAndLargest(int[] arr){
        System.out.println("\nOriginal array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        int[] ans = {arr[0], arr[arr.length - 1]};
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 4, 8, 2, 3, 7, 9};
        System.out.println("\nSmallest & largest number in the given array is :  "+Arrays.toString(smallestAndLargest(array)));
    }
}