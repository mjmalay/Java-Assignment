//6(b). write a java program to find sum of all odd  digits of any 4 digit number. 
public class Assignment1_6b
{
    public static void main(String[] args) 
    {
        int num=1234;
        int sum_odd;
       num=num%10;
       int num1=(num/10)%10;
       int num2=(num/100)%10;
       int num3=(num/1000)%10;

       sum_odd=(num%2==1?0:num)+(num1%2==1?0:num1)+(num2%2==1?0:num2)+(num3%2==1?0:num3);
        System.out.println("sum of odd digits: "+sum_odd);    
    }           
}
