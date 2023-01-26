package OOPs_Classes.arraysMethods;

class ArrayExample{
    void Array(){
        int[] ages = new int[3];
        float[] year = new float[3];

        ages[0] = 22;
        ages[1] = 23;
        ages[2] = 24;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }
    void multiArrays(){
        int[][] multiArray = new int[4][3];
        multiArray[0][0] = 5;
        multiArray[2][1] = 10;
        multiArray[3][2] = 15;
        System.out.println(multiArray[0][0]);
        System.out.println(multiArray[2][1]);
        System.out.println(multiArray[3][2]);
    }
}
public class Java_Arrays_3 {
    public static void main(String[] args) {
        ArrayExample array = new ArrayExample();
        array.Array();
        array.multiArrays();
    }
}
