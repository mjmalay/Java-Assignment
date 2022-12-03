/*
 * 11. Write a program to perform following using the numbers in between 23 to 249?
 *          b) find number of odd numbers that ends with 5 and 7?
 */


public class Assignment2_11b 
{
    public static void main(String[] args) 
    {
        int start = 23, end = 249, count = 0;
        for (int i = start; i <= end; i++)
         {
            if (i % 2 != 0) 
            {
                int digit = i % 10;
                if (digit == 5 || digit == 7)
                count++;
            }
        }
        System.out.println("There is total " + count + " number of odd numbers that ends with 5 and 7");
    }    
}
