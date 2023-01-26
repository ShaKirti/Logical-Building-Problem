package OOPs_Classes.arraysMethods;
// check an array is sorted or not.
public class ArrayQuestion_5 {
    static boolean isSorted(int[] arr){
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        boolean check = true;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i - 1]){
                //not sorted
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 5, 1, 5};
        int[] array2 = {1, 2, 2, 3, 6};
        System.out.println("\nIs sorted: "+isSorted(array));
        System.out.println("\nIs sorted: "+isSorted(array2));
    }
}
