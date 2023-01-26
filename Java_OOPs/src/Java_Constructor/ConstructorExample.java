package Java_Constructor;

public class ConstructorExample {
    String color;
    int price;
    ConstructorExample(String name, int modelNo){
        this.color = name;
        this.price = modelNo;
    }

    public static void main(String[] args) {
        ConstructorExample myObj = new ConstructorExample("Buggati",31651);
//        myObj.color = null;
//        myObj.price = 0;
        System.out.println(myObj.color+" "+ myObj.price);
    }
}
