import java.util.*;
class Number
{
    int sortno(int m[])
    {
    int a,b,temp;

    for(a=0;a<=8;a++)
    {
        for(b=a+1;b<=9;b++)
        {
            if(m[a]>m[b])
            {
                 temp = m[a];
                 m[a] = m[b];
                 m[b] = temp;
            }
        }
    }
    }

    double sortno(int n[])
    {
    int a,b,temp;

    for(a=0;a<=8;a++)
    {
        for(b=a+1;b<=9;b++)
        {
            if(n[a]<n[b])
            {
                 temp = n[a];
                 n[a] = n[b];
                 n[b] = temp;
            }
        }
    }
    }
}
class SortedList
{
    public static void main(String args[])
    {
         SortedList so = new SortedList();
         Scanner sc = new Scanner(System.in);

         int m[] = new int[10];
         double n[] = new double[10];

         for(int i=0;i<=9;i++)
         {
              System.out.println("Enter Integers : ");
              m[i] = sc.nextInt();
         }
         for(int j=0;j<=9;j++)
         {
              System.out.println("Enter double values : ");
              n[j] = sc.nextDouble();
         }
         int asc = so.sortno(m);
         System.out.println("Ascending order is : ");

         for(int k=0;k<=9;k++)
         {
              System.out.println(m[k]);
         }
         double des = so.sortno(n);
         System.out.println("Descending order is : ");

         for(int l=0;l<=9;l++)
         {
              System.out.println(n[l]);
         }
     }
}

         

        



