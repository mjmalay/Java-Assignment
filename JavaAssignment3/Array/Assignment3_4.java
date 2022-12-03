/*4) Write a program to sort 10 numbers in descending order and average of 3rd largest and 4th
smallest number in an array of 10 user defined numbers?
 */

public class Assignment3_4 
{
    public static void main(String[] args) {
        int arr[]=new int[]{2,8,4,3,9,5,6,1,7,2};
        System.out.println("User defined 10 number are :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("\nThe descending numbers are :");
      for(int i=0;i<arr.length;i++)
      {
         for(int j=i+1;j<arr.length;j++)
         {
            int temp=0;
            if(arr[i]<arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
         }
          System.out.print(arr[i]+" ");
      }
      float avg=0;
      avg=(arr[2]+arr[6])/2;
      System.out.println(" Average of 3rd largest and 4th smallest number: "+avg);
    }    
}
