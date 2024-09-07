import java.util.*;
class Employee
{
       
       
    public int empid;
    public double empsal;
    public String empname;
    public String empadd;
    public Employee(int e, String nm ,double s,String ad){
        empid = e;
        empname = nm;
        empsal = s;
        empadd = ad;
    }

    public int getEmpId(){
        return empid;
    }
    public String getEmpName(){
        return empname;
    }
    public double getSalary(){
        return empsal;
    }
    public String getEmpadd(){
        return empadd;
    }
    public void displayInfo() {
        System.out.println("ID: " + empid + ", Name: " + empname + ", Salary: " + empsal+",Address : " + empadd);
    }
    
}
class Main
{
    public static void main(String[]args)
    {
        /*for(int i=1;i<=5;i++)
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID :  ");
        int empid = sc.nextInt();
        System.out.println("Enter Employee Name :  ");
        String empname = sc.next();
        System.out.println("Enter Employee Salary :  ");
        int empsal = sc.nextInt();
        System.out.println("Enter Employee Address :  ");
        String empadd = sc.next();



        }*/

        Employee[] employees = new Employee[5];

        
        employees[0] = new Employee(1, "Ankita",80000,"Ichalkaranji");
        employees[1] = new Employee(2, "Smith", 70000,"Sangali");
        employees[2] = new Employee(3, "Bobi", 60000,"Kagal");
        employees[3] = new Employee(4, "David",50000,"Pune");
        employees[4] = new Employee(5, "Esha",40000,"Mumbai");

        
        for (Employee employee : employees) {
            employee.displayInfo();
        }
        
    }
}