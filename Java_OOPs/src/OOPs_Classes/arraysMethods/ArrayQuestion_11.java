package OOPs_Classes.arraysMethods;

// For an array of integers return the first value that is repeating in the array else return -1.

// break; statement use karne se sirf loop break hota hai, but return statement lene se pura method stop ho jata hai.

public class ArrayQuestion_11 {
    static int printArray(int[] arr){
        System.out.println("\nOriginal array:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 6, 4, 1, 8, 5};
        System.out.println("\nFirst repeating number in the given array is: "+printArray(array));
    }
}
