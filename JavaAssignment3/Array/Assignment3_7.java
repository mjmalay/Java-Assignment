/*7) Write a program to find transpose of a 3X4 matrics? */

import java.util.Scanner;
public class Assignment3_7 
{
    public static void main(String[] args) 
    {
        int arr[][]=new int[3][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element into the array: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("The entered matrix is : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println(" ");
        }
        int transpose[][]=new int[4][3];
        System.out.println("After transpose the given matrix :");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                transpose[i][j]=arr[j][i];
                System.out.print(transpose[i][j]+"  ");
            }
            System.out.println(" ");
        }

    }    
}
