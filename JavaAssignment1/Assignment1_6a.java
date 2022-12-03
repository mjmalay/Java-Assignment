//5(I). Sum of all digits of any 4 digit numbers
//6(a). write a java program to find sum of all even digits of any 4 digit number.
public class Assignment1_6a 
{
    public static void main(String[] args) 
    {
        int num=1234;
        int even,sum=0;
       num=num%10;
       int num1=(num/10)%10;
       int num2=(num/100)%10; 
       int num3=(num/1000)%10;

       even=(num%2==0?num:0)+(num1%2==0?num1:0)+(num2%2==0?num2:0)+(num3%2==0?num3:0);
        System.out.println("sum of even digits: "+even);    
    }    
}
