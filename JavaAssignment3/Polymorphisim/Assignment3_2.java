/*
 2) Write program to display following pattern using method overloading and constructor 
    overloading?

Odd number based pyramid starts from value n received from user
                 n+1
               n+3 n+6
            n+5 n+10 n+15
         n+7 n+14 n+21 n+28
 even number based pyramid starts from value n received from user
             n+2
           n+4 n+6
        n+6 n+10 n+14
      n+8 n+14 n+20 n+26
 user defined character suppose entered character is k
         k
        k k
       k k k
      k k k k 
*/
import java.util.Scanner;
class Pyramid
{
    public Pyramid(int num) 
    {
        if (num % 2 == 0)
         {
            evenPyramid(num);
         } else {
            oddPyramid(num);
         }
    }
    public Pyramid(char ch) 
    {
        charPyramid(ch);
    }
    public void oddPyramid(int num) 
    {
        int n = num;
        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 4 - i; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) 
            {
                System.out.print(n + 1 + " ");
                n += 2;
            }
            System.out.println();
        }
    }
    public void evenPyramid(int num) 
    {
        int n = num;
        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 4 - i; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print(n + 2 + " ");
                n += 4;
            }
            System.out.println();
        }
    }
     public void charPyramid(char ch) 
     {
        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 4 - i; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class Assignment3_2 
{
    public static void main(String[] args) 
    {
        Pyramid p = new Pyramid(6);
        Pyramid pm = new Pyramid('k');
        Pyramid pd = new Pyramid(3);

         
    }    
}



