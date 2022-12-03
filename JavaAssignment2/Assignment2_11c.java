/*11. Write a program to perform following using the numbers in between 23 to 249?
 *          c) find number of prime numbers?
 */


public class Assignment2_11c 
{
    public static void main(String[] args)
    {
        int start = 23, end = 249, count = 0;
        for (int i = start; i <= end; i++)
        {
            boolean isPrime = true;
            for(int j = 2; j < i; j++)
            {
                if(i%j == 0) isPrime =false;
            }
            if(isPrime) count++;
        }
        System.out.println("There is total "+count+" number of prime number in between "+start+" & "+end);
    }    
}
