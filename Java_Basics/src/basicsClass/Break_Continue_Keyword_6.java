package basicsClass;

public class Break_Continue_Keyword_6 {
    public static void main(String[] args) {
        System.out.println("Question 1 - Print the first multiple of 5 which is also a multiple of 7?");
        int num = 1;
        while (true){
            if (num%5==0 && num%7==0){
                System.out.println("Answer is: "+num);
                break;
            }
            num++;
        }

        System.out.println("Question 2 - Print all the values between 1 & 50 except for the multiple of 3?");
        int num1 = 1;
        for (num1 = 1; num1<=50; num1++){
            if (num1%3==0){
                continue;
            }
            System.out.println(num1);
        }
    }
}
