/*7) Write a java program to create banking application to perform following using using class and 
object?
        a) Initialize with initial balance Rs 3000 
        b) Deposit amount if balance is more than 1000 otherwise take Rs 100 as penalty for 
           deposit 
        c) Withdraw amount if balance is more than 1000 otherwise alert user for low balance
        d) check for balance */
import java.util.Scanner;
class Bank
{
    double balance;
    double amount=1500;
    double amt;
    Bank(double balance)
    {
        this.balance=balance;
    }
    double Initialize()
    {
        return balance;
    }
    double deposit()
    {
        
        if(balance>1000)
        {

            return amount+balance;
        }
        else {
           return  amount+balance-100;
        }

    }
    double Withdraw()
    {
      
        if (balance>1000)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter amount to withdraw :");
            amt=sc.nextDouble();
            
        }
        else{
            System.out.println("low balance");
        }
        return balance-amt;
    }
    double check()
    {
        return balance;
    }
}

public class Assignment3_7 
{
    public static void main(String[] args) 
    {
        Bank b=new Bank(3000);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the option to perform the task :");
        System.out.println("a)initial the balance ");
        System.out.println("b) Deposit amount if balance is more than 1000 otherwise take Rs 100 as penalty for deposit ");
        System.out.println("c) Withdraw amount if balance is more than 1000 otherwise alert user for low balance");
        System.out.println("d) check for balance");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
                    System.out.println("The balance is :"+b.Initialize());
                    break;
            case 'b':
                    System.out.println("After deposit balance :"+b.deposit());
                    break;
            case 'c':
                    System.out.println("After withdraw balance : "+b.Withdraw());
                    break;
            case 'd':
                    System.out.println("total balance :"+b.check());
                    break;                    

        }

    }
}
