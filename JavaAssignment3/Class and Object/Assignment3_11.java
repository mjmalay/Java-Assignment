/*11) Write a program to swap two numbers without using 3rd variable and with using 3rd variable using class and object ? */
import java.util.Scanner;
class Test
{
    int a;
    int b;
    Test(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void swap1()
    {
        System.out.println("\n\nSwapping without using 3rd variable ");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The value of a:"+a+" \nThe value of b: "+b);
    }
    void swap2()
    {
        System.out.println("\n\nSwapping with using 3rd variable ");
        int c=a;
        a=b;
        b=c;
        System.out.println("The value of a: "+a+" \nThe value of b :"+b);
    }
}

public class Assignment3_11 
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Entered value of a: "+a);
        System.out.println("Entered value of b: "+b);
        Test t=new Test(a,b);
        t.swap1();
        Test t1=new Test(a,b);
        t1.swap2();
            
    }
    
}
