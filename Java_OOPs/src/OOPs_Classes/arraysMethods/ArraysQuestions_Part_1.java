package OOPs_Classes.arraysMethods;

class Array_bhai{
    static void sumOfArray(){
        int[] arr = {12,25,41,69,26};
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum += arr[i];
//            System.out.println(sum);
        }
        System.out.println("Answer - Sum of the elements in the given array is: "+sum);
    }
    static void maxValue(){
        int[] maxi = {12,4,9,15};
        int max = 0;
        for (int i= 0; i<maxi.length; i++){
            if (maxi[i] > max) {
                max = maxi[i];
            }
        }
        System.out.println("Answer - Maximum value is: "+max);
    }

    static void serchElement(){
        int[] array = {4,6,10,8,10};
        int num = 10;
//        int num = 20;
        int flag = -1;

        for (int i = 0; i<array.length; i++){
            if (array[i] == num){
                flag = i;
                break;  // break; is using because if the given number comes in the array for two or more times then baad vala
                // number jis index pr hai vo value print kr dega. So to avoid this we are using break here.
            }
        }
        System.out.println("Answer - Number "+num+" is present in the array at index: "+flag);
    }
}
public class ArraysQuestions_Part_1 {
    public static void main(String[] args) {
        System.out.println("Question 1 - Calculate the sum of the elements in the array?");
        Array_bhai.sumOfArray();

        System.out.println("*******************************************************************************************************");
        System.out.println("Question 2 - Calculate the maximum value in the given array?");
        Array_bhai.maxValue();


        System.out.println("*******************************************************************************************************");
        System.out.println("Question 3 - Search the element in the array. If present then return the index else return -1?");
        Array_bhai.serchElement();
    }
}

