/* 6) Write a program to determinant and inverse of a 3X3 matrics?
*/


import java.util.Scanner;
public class Assignment3_6
{
    public static void main(String[] args) 
    {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element of 3x3 matrix : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The entered  matrix elements : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               System.out.print(arr[i][j]+"  ");
            }
            System.out.println(" ");
        }
        int determinant;
        determinant=(arr[0][0]*arr[1][1])-(arr[0][1]*arr[1][0]);
        System.out.println("\n\n\ndeterminant of the given matrix: "+determinant);
        int temp;
        temp=arr[0][0];
        arr[0][0]=arr[1][1];
        arr[1][1]=temp;
        arr[0][1]=-arr[0][1];
        arr[1][0]=-arr[1][0];

        System.out.println("\n\n\nThe inverse matrix is :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]/determinant+"  ");
            }
            System.out.println("  ");
        }
    }    
}
