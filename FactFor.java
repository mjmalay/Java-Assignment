import java.util.Scanner;

public class FactFor 
{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int num,temp=1;
        System.out.println("Enter a number :");
        num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            temp=temp*i;
        }
        System.out.println("The factorial of "+num+" is "+temp);
    }    
}
