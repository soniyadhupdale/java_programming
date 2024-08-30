import java.util.*;
class Exp8_Exception
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b,c;
        
        System.out.println("Enter elements to divide : ");
        int arr[] = new int[n];
        
        try
        {
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter your denominator : ");
            b = sc.nextInt();
            
            for(int i=0;i<n;i++)
            {
                c = arr[i]/b;
                System.out.println("Division = "+c);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}