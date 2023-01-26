package OOPs_Classes.arraysMethods;
// Program to find the triplets whose sum is equal to the target value.
public class ArrayQuestion_8 {
    static int printArray(int[] arr, int target) {
        System.out.println("\nOriginal array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target)
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] array = {3, 4, 2, 5, 6, 1};
        int[] array = {1, 4, 5, 6, 3};
        System.out.println("\nNumber triplets whose sum is equal to target: " + printArray(array, 12));
    }
}
