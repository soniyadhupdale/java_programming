import java.lang.*;
import java.io.*;
import java.util.*;

class Bird
{
    String category;

    Bird(String a)
    {
         category = a;
    }
    void show()
    {
         System.out.println("\nCategory = "+category);
    }
}
class Parrot extends Bird
{
    int nop;
    Parrot(int b,String a)
    {
         super(a);
         nop = b;
    }
    void show()
    {
        System.out.println("\n No of parrots : "+nop);
    }
}
class Birds
{
    public static void main(String args[])
    {
         Parrot p = new Parrot(5,"my_parrot");
         p.show();
    }
}