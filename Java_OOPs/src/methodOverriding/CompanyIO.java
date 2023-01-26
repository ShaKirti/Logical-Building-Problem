package methodOverriding;

public class CompanyIO {
    public void showName(){
        System.out.println("Company is working for our client.");
    }
}

class Emp extends CompanyIO{
    public void showName(){
        System.out.println("I am the employee of the company.");
    }
}