package OOPs_Classes.arraysMethods;
// For an array of integers return the last value that is repeating in the array else return -1.
public class ArrayQuestion_12 {

    static int printArray(int[] arr){
        System.out.println("\nOriginal array:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");

        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    lastIndex = arr[i];
                    System.out.println(lastIndex);
                }
            }
        }
        return lastIndex;
    }
    public static void main(String[] args) {

        System.out.println();
        int[] array = {1, 2, 3, 4, 3, 1, 5, 2};

        System.out.println("\n Last value of a repeated number in the given array is: "+printArray(array));
    }
}
