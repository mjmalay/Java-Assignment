/* 6) Write a program to check whether a number or string is palindrome or not using method overloading ? */
import java.util.Scanner;
class Test
{
    public void palindrome(int n)
    {
        int temp=n;
        int pal=0;
        while(n>0)
        {
            int a=n%10;
            pal=(pal*10)+a;
            n=n/10;
        }
        if(temp==pal)
        {
            System.out.println(temp+" is a palindrome number.");
        }
        else{
            System.out.println(temp+" is not a palindrome.");
        }
    }
    public void palindrome(String s)
    {
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if(s.toLowerCase().equals(rev.toLowerCase()))
        {
            System.out.println(s+" is a palindrome string.");
        }
        else{
            System.out.println(s+" is not a palindrome.");
        }
    }
}

public class Assignment3_6 
{
    public static void main(String[] args)
    {
        Test t=new Test();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check ,whether it is palindrome or not :");
        int num=sc.nextInt();
        System.out.println("Enter a string to check ,whether it is palindrome or not :");
        String s=sc.next();
        t.palindrome(num);
        t.palindrome(s);
    }
}
