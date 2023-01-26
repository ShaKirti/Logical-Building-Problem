package methodOverriding;

public class Main {
    public static void main(String[] args) {
        new CompanyIO().showName();
        System.out.println("------ Emp class -------");
        new Emp().showName();
    }
}
