package DOUBLE_DIMMENSION_ARRAY;
// Implemented multiplication and transpose of a matix

import java.util.Scanner;

class double_array
{
    public static int[][] insert(int arr[][])
    {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print("Enter the element at [" + i + "] and [" + j + "] position : ");
                int element = input.nextInt();
                arr[i][j] = element;
            }
        }
        input.close(); //comment this
        return arr;
    }

    public static int[][] square(int arr[][])
    {
        int a[][] = new int[arr.length][arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                for(int k = 0; k < arr.length; k++)
                {
                    a[i][j] = a[i][j] + arr[i][k] * arr[k][j];
                }
            }
        }
        return a;
    }

    public static int[][] multiply(int A[][], int rA, int cA, int B[][], int rB, int cB)
    {
        int C[][] = new int[rA][cB];
        for(int i = 0; i < rA; i++)
        {
            for(int j = 0; j < cB; j++)
            {
                for(int k = 0; k < cA; k++)
                {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static void print(int arr[][])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no.of rows of the matix A : ");
        int rA = input.nextInt();
        System.out.print("Enter the no.of columns of the matix A : ");
        int cA = input.nextInt();
        int arrA[][] = new int[rA][cA];
        int A[][] = insert(arrA);
        System.out.println();
        System.out.print("Enter the no.of rows of the matix B : ");
        int rB = input.nextInt();
        System.out.print("Enter the no.of columns of the matix B : ");
        int cB = input.nextInt();
        int arrB[][] = new int[rB][cB];
        int B[][] = insert(arrB);
        System.out.println("\n");
        System.out.println("The MATRIX 'A' is:");
        print(A);
        System.out.println("\n");
        System.out.println("The MATRIX 'B' is:");
        print(B);
        System.out.println("\n");
        if(cA != rB)
        {
            System.out.println("Cannot multiply these matrices!");
            input.close();
            return ;
        }
        else
        {
            int C[][] = multiply(A, rA, cA, B, rB, cB);
            print(C);
        }
        

        // int a[][] = square(arr);
        // System.out.println("Square of the matrix is: ");
        // print(a);
        input.close();
    }
}