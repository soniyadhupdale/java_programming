import java.util.*;

class BasicOperations
{
   public static void main(String args[])
   {
         int a,b,sum,sub,mul;
         double div,mod;
     
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter first number : ");
         a = sc.nextInt();

         System.out.println("Enter second number : ");
         b = sc.nextInt();

         sum = a+b;
         sub = a-b;
         mul = a*b;
         div = a/b;
         mod = a%b;
      
         System.out.println("Addition : "+sum);
         System.out.println("Substraction : "+sub);
         System.out.println("Multiplication : "+mul);
         System.out.println("Division : "+div);
         System.out.println("Modulus : "+mod);
    }
}