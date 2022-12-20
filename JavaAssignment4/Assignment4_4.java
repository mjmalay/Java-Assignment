/* 4. WAP to find repeated elements and no of repeated elements in the array of 20 user defined 
values and also remove redundant values and update array with unique values only using simple 
inheitence?  */

import java.util.Arrays;
import java.util.Scanner;

class repeatedValue
{
    int[] arr;
    public void getElements(int[] arr)
    {
        
        this.arr = arr;
    }
}

class removeRedudant extends repeatedValue
{
    public removeRedudant()
    {
        super.getElements(arr);
    }
    public void removeDuplicates()
    {
        int c=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    arr[i] = Integer.MIN_VALUE;
                    c++;
                }
            }
        }
        int[] arr2 = new int[arr.length-c];
        int j =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != Integer.MIN_VALUE)
            {
                arr2[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
class Assignment4_4{
    public static void main(String[] args) 
    {
        
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element Into Array : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        removeRedudant obj = new removeRedudant();
        obj.getElements(arr);
        obj.removeDuplicates();
    }
}