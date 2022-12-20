/*2) Write a program to find average of the numbers available in left and right side of the number 
required by user if available in an array of 10 user defined number otherwise replace the item of
the array placed in middle position with the number required by user and calculate output?  */
import java.util.*;
public class Assignment3_2
{
        public static void main(String[] args) 
        {
               
                int leftCount=0 , rightCount=0;
                int leftAvg =0, rightAvg =0 , userNum = -1;
                int[] arr = new int[10];
                Scanner sc = new Scanner(System.in);
                for(int i=0;i<10;i++)
                {
                        arr[i] = Integer.parseInt(sc.next());
                }
                System.out.print("\nEnter Number : ");
                userNum =sc.nextInt();
                for(int i=0;i<10;i++)
                {
                        if(arr[i]==userNum)
                        {
                              rightCount = 10-leftCount;
                              for(int j = i+1 ;j<10;j++)
                              {
                                 rightAvg+=arr[j];
                              }
                                break;
                         }
                leftCount++;
                leftAvg += arr[i];
                }
                if(leftCount == arr.length)
                {
                        System.out.println("Not found SO trying Alternative : ");
                        System.out.println("Changed : "+arr.length/2);
                        arr[arr.length/2-1] = userNum;
                        leftAvg =0;
                        rightAvg = 0;
                        leftCount = (arr.length/2)-1;
                        rightCount = 10-leftCount;
                }
                for(int i=0;i<arr.length/2-1 ;i++)
                {
                     leftAvg += arr[i];
                }
                for(int i=rightCount-1 ; i<10;i++)
                {
                      rightAvg += arr[i];
                }
                System.out.println("Found between : "+leftCount+" - "+rightCount);
                System.out.println("Left Average : "+leftAvg);
        }
}
