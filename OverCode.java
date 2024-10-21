import java.util.*;

class OverCode
{
    double showarea(double a, double b)
    {
         return(0.5*a*b);
    }
    int showarea(int m,int n)
    {
        return(m*n);
    }
    double showarea(double x)
    {
        return(3.142*x*x);
    }

    public static void main(String args[])
    {
         OverCode obj = new OverCode();

         Scanner sc = new Scanner(System.in);

         System.out.print("\nEnter base and height : ");
         double b = sc.nextDouble();
         double h = sc.nextDouble();

         System.out.print("Enter length and breadth : ");
         int l = sc.nextInt();
         int br = sc.nextInt();

         System.out.print("Enter radius : ");
         double r = sc.nextDouble();

         double tri = obj.showarea(b,h);
         int rec = obj.showarea(l,br);
         double cir = obj.showarea(r);

         System.out.println("\nArea of triangle   = "+tri);
         System.out.println("Area of rectangle  = "+rec);
         System.out.println("Area of circle     = "+cir);
     }
}