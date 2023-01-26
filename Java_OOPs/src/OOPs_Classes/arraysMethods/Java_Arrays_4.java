package OOPs_Classes.arraysMethods;

class Array{
    void arrayExample(){
        int[] classes = new int[25];
        classes[0] = 11;
        classes[1] = 21;
        classes[2] = 211;
        classes[3] = 65;
        classes[4] = 8;
        classes[5] = 12;

//        Traversing in array using For loop-
//        for (int i = 0; i<25; i++)
//            System.out.println(classes[i]);


//        Traversing in array using For-each loop
//        for (int nums:classes
//             ) {
//            System.out.println(nums);
//        }


//        Traversing in array using While loop-
        int i=0;
        while(i<12){
            System.out.println(classes[i]);
            i++;
        }
    }
    void multiArrays(){
//        int[][] multiArray = new int[4][3];
//        multiArray[0][0] = 5;
//        multiArray[2][1] = 10;
//        multiArray[3][2] = 15;

        int[][] multiArray = {{4,5,8},{12,14,15}};
        for (int i=0; i<multiArray.length; i++){
            for (int j = 0; j<multiArray[i].length; j++) {
                System.out.println(multiArray[i][j]);
            }
        }
    }
}
public class Java_Arrays_4 {
    public static void main(String[] args) {
        Array newArray = new Array();
        newArray.arrayExample();

        //Print multiDimensional array
        newArray.multiArrays();
    }
}
