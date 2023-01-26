package OOPs_Classes.arraysMethods;

import java.util.Arrays;

public class ArrayClone {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};

        System.out.println("Original arr: ");
        printArray(arr);
        System.out.println();

        //copying arr to arr_2
//        int[] arr_2 = arr;
        int[] arr_2 = arr.clone(); //instead of using assigning we can use clone() method to avoid the changes in original array.

//        int[] arr_3 = Arrays.copyOf(arr,arr.length);
        int[] arr_3 = Arrays.copyOf(arr,3);

        int[] arr_4 = Arrays.copyOfRange(arr, 0, 1);
        System.out.println("Copied arr_2: ");
        printArray(arr_2);
        System.out.println();

        arr_2[0] = 0;
        arr_2[1] = 0;
        arr_2[2] = 0;

        System.out.println("Original arr after changing arr_2:");
        printArray(arr);
        System.out.println();

        System.out.println("Copied arr_2 after changing arr_2:");
        printArray(arr_2);
        System.out.println();

        System.out.println("Original arr after changing arr_3:");
        printArray(arr);
        System.out.println();
        arr_3[0] = 6;
        arr_3[0] = 4;
        arr_3[0] = 3;
        System.out.println("Copied arr_3 by using copyof method in Arrays class: ");
        printArray(arr_3);
        System.out.println();

        System.out.println("Copied arr_4 by using copyofRange method in Arrays class: ");
        printArray(arr_4);
    }
}
