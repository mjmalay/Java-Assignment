/*4) Write a program to calculate interest that may be simple or compound using method overloading? */
import java.util.Scanner;
import java.lang.Math;
class Test
{
    double amount;
    double rate;
    double time;
    Test(double amount,double rate,double time)
    {
        this.amount=amount;
        this.rate=rate;
        this.time=time;
    }
    public double interest()
    {
      double SI= (amount*rate*time)/100;
      return SI;
      
    }
    public double interest(double CI)
    {
        CI=amount*(Math.pow((1+rate/100),time));
        return CI;
    }
}
public class Assignment3_4 
{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double amount;
        double rate;
        double time;
        System.out.println("Enter amount,rate of intrest and time : ");
        amount=sc.nextDouble();
        rate=sc.nextDouble();
        time=sc.nextDouble();
        Test t=new Test(amount,rate,time);
        double SI =t.interest();
        System.out.println("Simple intrest :"+SI);
        double CI=t.interest(7.8f);
        System.out.println("Compound Intrest : "+CI);
        
    }
}
