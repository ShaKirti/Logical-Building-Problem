package methodOverloading;

public class Main {
    public void read(){
        System.out.println("Reading Novel");
    }
    public void read(String name){
        System.out.println("Reading "+name);
    }

    public static void main(String[] args) {
        new Main().read();
        new Main().read("BhagvadGeeta");
    }
}
