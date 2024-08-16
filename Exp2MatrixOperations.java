import java.util.Scanner;

class Matrix 
{

    int A[][] = new int[2][2];
    int B[][] = new int[2][2];
    int C[][] = new int[2][2];

    Scanner obj = new Scanner(System.in);

    void Getmatrix1() 
    {
        System.out.println("Enter the matrix 1 elements : ");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                A[i][j] = obj.nextInt();
            }
        }
    }

    void Getmatrix2() 
    {
        System.out.println("Enter the matrix 2 elements : ");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                B[i][j] = obj.nextInt();
            }
        }
    }

    void add() 
    {
        System.out.println("\nAddition is : ");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    void sub() 
    {
        System.out.println("\nSubtraction is : ");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                C[i][j] = A[i][j] - B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    void mul() 
    {
        System.out.println("\nMultiplication is : ");
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                C[i][j] = 0;                 // Initialize C[i][j] to zero
                for (int k = 0; k < 2; k++) 
                {
                    C[i][j] = A[i][k] * B[k][j];
                }
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Exp2_MatrixOperations 
{

    public static void main(String args[]) 
    {
        Matrix m = new Matrix();

        m.Getmatrix1();
        m.Getmatrix2();

        m.add();
        m.sub();
        m.mul();
    }
}