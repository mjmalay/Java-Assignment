/*
 * 11. Write a program to perform following using the numbers in between 23 to 249?
 *              d) find number of palindrome numbers?
 */


public class Assignment2_11d 
{
    public static void main(String[] args) 
    {
        int start = 23, end = 249, count = 0;
        for (int i = start; i <= end; i++)
        {
            int temp, d, rev = 0;
            temp = i;
            while(temp > 0)
            {
                d = temp % 10;
                rev = rev * 10 + d;
                temp /= 10;
            }
            if(rev == i) count++;
        }
        System.out.println("There is total "+count+" number of palindrome number in between "+start+" & "+end);
    }    
}
