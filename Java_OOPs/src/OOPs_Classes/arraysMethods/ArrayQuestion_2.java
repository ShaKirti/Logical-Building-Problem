package OOPs_Classes.arraysMethods;
// count the number of occurence of a particular element x.
public class ArrayQuestion_2 {
    static void printArray(int[] arr, int value){
        System.out.println("\nOriginal array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        int count = 0;
        for (int i = 0;  i < arr.length; i++){
            if (value==arr[i]){
                count++;
            }
        }
        System.out.println("Number of occurence of "+value+" in a given array is: "+count);
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 5, 1, 5};
        printArray(array,5);
    }
}
