/*5) Write a program to find summation, subtraction and multiplication of two 3X4 matrices ? */

import java.lang.*;
import java.util.Scanner;
public class Assignment3_5 
{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int A[][]=new int[3][4];
        int B[][]=new int[3][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of first 3x4 matrices : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                A[i][j]=sc.nextInt();
            }

        }
        System.out.println("Enter the number of first 3x4 matrices : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                B[i][j]=sc.nextInt();
            }

        }

        System.out.println("The entered A-matrix is ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println(" ");
        }

        System.out.println("The entered B-matrix is ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(B[i][j]+"  ");
            }
            System.out.println(" ");
        }

        int Sum[][]=new  int[3][4];
        System.out.println("The summation of A and B matrices : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                Sum[i][j]=A[i][j]+B[i][j];
                System.out.print(Sum[i][j]+"  ");
            }
            System.out.println(" ");
        }
        int Sub[][]=new int[3][4];
        System.out.println("The Substraction of A and B matrices : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                Sub[i][j]=A[i][j]-B[i][j];
                System.out.print(Sub[i][j]+"  ");
            }
            System.out.println(" ");
        }
        int Mult[][]=new int[3][4];
        System.out.println("The Multiplication of A and B matrices : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
              for(int k=0;k<4;k++)
              {
                  Mult[i][j]+=A[i][k]*B[k][j];
              }
              System.out.println(Mult[i][j]+"  ");
            }
            System.out.println(" ");
        }

    }    
}
