package OOPs_Classes.arraysMethods;

import java.util.Arrays;

// Find the unique number in the given array where all the elements are being repeated twice with one value being unique.
public class ArrayQuestion_9 {
    static int printArray(int[] arr){
        System.out.println("\nOriginal array:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                   arr[i] = -1;
                   arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != -1){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 1, 3};
//        System.out.println("\nThe unique number in the given array "+ Arrays.toString(array)+" is: "+printArray(array));
        System.out.println("\nThe unique number in the given array is: "+printArray(array));
    }
}
