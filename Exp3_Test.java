import java.util.*;
class Employee
{
    public String F_name;
    public String L_name;
    public Double M_sal;
    public String f1;
    public String f2; 
    public Double f3;
    public Double Y_sal;
    public Double Total_sal;

    public Employee(String s1,String s2,Double s3)
    {
        F_name = s1;
        L_name = s2;
        M_sal  = s3;
    }
   /* public void show()
    {
        System.out.println("F_name : "+ F_name +" "+ "L_name : " + L_name +" "+ "M_sal : " + M_sal);
        Double t_sal = M_sal*12 + 0.1;
        System.out.println("F_name : "+ F_name +" "+ "L_name : " + L_name +" "+ "Total_sal : " + t_sal);
    }*/

    public void setfname(String f1)
    {
       
         F_name = f1;
    }
    public void setlname(String f2)
    {
      
        L_name = f2;
    }
    public void setmsal(Double f3)
    {
      
      M_sal = f3; 
    }
    public String getfname()
    {
        return F_name;
    }
    public String getlname()
    {
        return L_name;
    }
    public Double getmsal()
    {
        return M_sal;
    }
    
    public Double raise()
    {
        Y_sal = M_sal*12;
        Total_sal = Y_sal +Y_sal* 0.1;
        return Total_sal;
    }
    
}
class Exp3_Test
{
    public static void main(String[]args)
    {
        Employee e1 = new Employee("Ankita","Dhagate",50000.0);
        Employee e2 = new Employee("Sanika","Patil",20000.0);
    
       Scanner sc = new Scanner(System.in);
       System.out.println("New F_name :  ");
       String s1 = sc.next();
       e1.setfname(s1);
       System.out.println("New L_name :  ");
       String s2 = sc.next();
       e1.setlname(s2);
       System.out.println("New M_sal :  ");
       Double s3 =sc.nextDouble();
       e1.setmsal(s3);

       
        e1.getfname();
        e1.getlname();
        e1.getmsal();
        double ys= e1.raise();
        System.out.println("Year after sal : "+ys);
        System.out.println("F_name : "+e1.getfname()  +" "+ "L_name : " +e1.getlname() +" "+ "Year_sal : " +e1.getmsal()*12);
        System.out.println("F_name : "+e1.getfname()  +" "+ "L_name : " +e1.getlname() +" "+ "Total_sal : " + ys);

        
    }
}