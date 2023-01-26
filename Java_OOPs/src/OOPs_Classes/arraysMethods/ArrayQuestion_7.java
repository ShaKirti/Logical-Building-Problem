package OOPs_Classes.arraysMethods;
// Program to find the total number of pairs in the arrays whose sum is equal to the given value x.

public class ArrayQuestion_7 {
    static void printArray(int[] arr, int target){
        System.out.println("\nOriginal array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        System.out.println("\nNumber pairs are: "+count);
    }
    public static void main(String[] args) {
        System.out.println();
        int[] array = {4, 5, 6, 7, 9, 3, 8};
        printArray(array,12);
    }
}
