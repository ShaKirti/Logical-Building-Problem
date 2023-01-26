package OOPs_Classes.arraysMethods.integerArray;

public class IntegerArray {
    static void arrayInt(int[] arr){
        for(int i = 0; i<arr.length; i++){
//            System.out.println(arr[i]);
            System.out.print(arr[i]+",");
        }
    }

    public static void main(String[] args) {
        int[] array = {21,52,63,58,6,4,5};
        IntegerArray.arrayInt(array);
    }
}
