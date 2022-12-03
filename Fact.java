import java.util.Scanner;

public class Fact 
{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int num,temp=1;
        System.out.println("Enter a number :");
        num=sc.nextInt();
        int n=num;
        while(n>0)
        {
            temp=temp*n;
           n= n-1;
        }
        System.out.println("The factorial of "+num+" is "+temp);
    }    
}
