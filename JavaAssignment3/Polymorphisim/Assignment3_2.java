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
class Test
{
   public static void pyramid(char b) 
   {
      for (int i = 1; i <= 4; i++) 
      {
          for (int j = 4 - i; j > 0; j--)
              System.out.print(" ");
          for (int k = 1; k <= i; k++)
              System.out.print("k ");
          System.out.println("");
      }
   }
   public static void pyramid(int a)
    {
      for (int i = 1; i <= 4; i++) 
      {
          for (int j = 4 - i; j > 0; j--)
              System.out.print(" ");
          for (int k = 1; k <= i; k++) 
          {
              int b = i * 2 - 1;
              int c = a + b * k;
              System.out.print(c + " ");
          }
          System.out.println("");
      }
   }
   public static void pyramid(double c) 
   {
      for (int i = 1; i <= 4; i++) 
      {
          for (int j = 4 - i; j > 0; j--)
              System.out.print(" ");
          for (int k = 1; k <= i; k++) 
          {
              double a = c + 2 + ((i - 1) * 2) * k;
              System.out.print(a + " ");
          }
          System.out.println("");
      }
   
   }
}

public class Assignment3_2 
{
    public static void main(String[] args) 
    {
         Test t= new Test();
         Scanner sc = new Scanner(System.in);
         System.out.println("enter 0 for even number pyramid,1 for odd number pyramid,any other number for charechter pyramid");
         int a = sc.nextInt();
         if (a == 0) 
         {
             double b = sc.nextDouble();
             t.pyramid(b);
         } else if (a == 1) 
         {
             int c = sc.nextInt();
             t.pyramid(c);
         } else  {
             String d = sc.next();
             t.pyramid(d.charAt(0));
         }
    }    
}



