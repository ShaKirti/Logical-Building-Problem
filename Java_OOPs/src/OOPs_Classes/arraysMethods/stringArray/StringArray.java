package OOPs_Classes.arraysMethods.stringArray;

public class StringArray {
    static void arrayString(String[] arr){
        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]+" , ");
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        String[] array = {"Shashank", "Puja", "Vijay", "Venky"};
        arrayString(array);
    }
}
