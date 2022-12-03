// 5(I). Sum of all digits of any 4 digit numbers
public class Assignment1_5i 
{
    public static void main(String[] args) 
    {
        int num=1234;
        int sum=0;
        
       sum=(num%10)+((num/10)%10)+((num/100)%10)+((num/1000)%10);
        System.out.println("Sum of all digits :"+ sum);
    }    
}
