import java.util.*;
public class Mobile 
{
    String name;
    String brand;
    double price;

    public Mobile(String nm, String br, double p) 
    {
        name = nm;
        brand = br;
        price = p;
    }

    public void display() 
    {
        System.out.println("Mobile Name: " + name);
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Price: " + price);
    }

    public static void main(String[] args) 
    {
        Mobile mobile1 = new Mobile("Galaxy s25","Samsung",22000);
        Mobile mobile2 = new Mobile("Iphone 15pro","Apple",45000);

        System.out.println("Mobile 1 Details:");
        mobile1.display();

        System.out.println("\nMobile 2 Details:");
        mobile2.display();
    }
}
