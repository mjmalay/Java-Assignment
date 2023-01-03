/*6. WAP to perform following using interface and package to deposit, withdraw, check balance for 
banking application 
        I. Assign a fixed value as balance for account 
        II. Deposit user defined amount and display updated balance 
        III. Withdraw user defined money if user has sufficient fund otherwise show Insufficient fund 
        using custom exception 
        IV. Check for balance 
        V. Maintain a fixed amount 3000 in the account 
 */
import java.util.*;
interface Bank
{
    void deposit(double amount);
    void withdraw(double amount)throws InsufficientFundException;
    void check_balance();

}

class InsufficientFundException extends Exception{
    public  InsufficientFundException(String msg){
        super(msg) ;
    }
}

class bankAcc implements Bank
{
    private static String bankName ;
    private static String ifsc ;
    private static String branch ;

    String name ;
    int bankAcNum ;
    double balance ;

    public bankAcc(String bankName,String ifsc,String branch){
        this.bankName = bankName ;
        this.ifsc = ifsc ;
        this.branch = branch ;
        
    }
    {
        name = "Malay ranjan " ;
        bankAcNum  = 328746324 ;
        balance = 3000 ;

    }
    public void deposit(double amount){
        balance = balance + amount ;
        check_balance(); 

    }
    public void withdraw(double amount) throws InsufficientFundException{
        if (amount > balance){
            throw new InsufficientFundException("Insufficent fund .") ;
        }
        else{
            balance = balance - amount ;
        }
        check_balance();

    }
    public void check_balance(){
        System.out.println("Remaaining Balance left :"+balance);

    }
    public void details(){
        System.out.println("Bank Name  :"+this.bankName);
        System.out.println("Ifsc code :"+this.ifsc);
        System.out.println("Branch Name :"+this.branch);
        System.out.println("Name :"+this.name);
        System.out.println("Account Num :"+this.bankAcNum);
    }
}
 
public class Assignment4_6 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double amountD=sc.nextDouble();
        bankAcc b= new bankAcc("Hdfc" ,"HDf1234" ,"Sarang");

        b.deposit(amountD);

        System.out.println("Enter the amoun to withdrawt: ");
        double amountW=sc.nextDouble();

        try{
            b.withdraw(amountW);
        }catch(InsufficientFundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        b.details();   
    }
}
