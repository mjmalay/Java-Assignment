/*3) Write a program to sort 10 numbers in ascending order and find the sum of product of 2nd
smallest and 3rd largest number? */ 

import java.util.Scanner;
public class Assignment3_3 
{
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 number into the array :");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("The ascending numbers are :");
      for(int i=0;i<10;i++)
      {
         for(int j=i+1;j<10;j++)
         {
            int temp=0;
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
         }
          System.out.print(arr[i]+" ");
      }
     int sumOfproduct=0;
     sumOfproduct=sumOfproduct+(arr[1]*arr[7]);
     System.out.println("\nThe sum of product of 2nd smallest and 3rd largest number : "+sumOfproduct);
    }
}
