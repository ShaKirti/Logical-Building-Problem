package OOPs_Classes;

public class Intro_OOPs {
    public static class Car{
        String color;
        int price;
        public Car(String color, int price){
            this.color = color;
            this.price = price;
        }
    }
    public static void main(String[] args) {
        Car BMW = new Car("red",250000);
//        BMW.color = "Blue";
//        BMW.price = 2500957;
        System.out.println("Car color: "+BMW.color+", "+"& Car price: "+BMW.price);
    }
}