import java.io.*;

class ArithOperation
{
  public static void main(String args[])
  {
    System.out.println("Program Started....");
    int a=10,b=0,c;   //Exception is occur

     try
     {
       c=a/b;
       System.out.println(c);
     }

     catch(Exception e)
     {
      System.out.println(e);
     }
    System.out.println("Program is Ended.");
   }
}