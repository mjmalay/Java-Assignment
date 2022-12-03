import java.util.Scanner;

public class EvenOddCheck 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num,evensum=0,oddsum=0;
        System.out.println("Enter any 4-digit  number to check even or odd :");
        num=sc.nextInt();

        int d1,d2,d3,d4,ed1,ed2,ed3,ed4,od1,od2,od3,od4;
        d1=num%10;
        d2=(num/10)%10;
        d3=(num/100)%10;
        d4=(num/1000)%10;

        if(d1%2==0)
        {
            ed1=d1;
            evensum=evensum+ed1;
            System.out.println(evensum+" is an even number");
        }
        else
        {
            od1=d1;
            oddsum=oddsum+od1;
            System.out.println(oddsum+ " is an odd number");
        }
        if(d2%2==0)
        {
            ed2=d2;
            evensum=evensum+ed1;
            System.out.println(ed2+" is an even number");
        }
        else
        {
            od2=d2;
            oddsum=oddsum+od1;
            System.out.println(od2+ " is an odd number");
        }
        if(d3%2==0)
        {
            ed3=d3;
            evensum=evensum+ed1;
            System.out.println(ed3+" is an even number");
        }
        else
        {
            od3=d3;
            oddsum=oddsum+od1;
            System.out.println(od3+ " is an odd number");
        }
        if(d4%2==0)
        {
            ed4=d4;
            evensum=evensum+ed4;
            System.out.println(ed+" is an even number");
        }
        else
        {
            od4=d4;
            oddsum=oddsum+od4;
            System.out.println(oddsum+ " is an odd number");
        }

    }
    
}
