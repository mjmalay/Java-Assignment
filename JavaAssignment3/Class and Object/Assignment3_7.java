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
    Bank()
    {
        this.balance=3000;
    }
    double Initialize()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        
        if(balance>1000)
        {

             balance=amount+balance;
             System.out.println("Balance: "+balance);
        }
        else {
            balance=balance-100;
            balance=balance+amount;
            System.out.println("Balance: "+balance);
        }

    }
    public void  Withdraw(double amount)
    {
      
        if (balance>1000)
        {
           balance=balance-amount;
           System.out.println("Balance: "+balance);
        }
        else{
            System.out.println("low balance");
        }
       
    }
    public void check()
    {
        System.out.println("Balance: "+balance);
    }
}

public class Assignment3_7 
{
    public static void main(String[] args) 
    {
        Bank b=new Bank();
        b.deposit(1000);
        b.Withdraw(1000);
        b.check();       
    }
}
