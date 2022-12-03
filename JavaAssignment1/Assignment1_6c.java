//6(c). write a java program to find diference between average of all even digits except divisible by 4 and average of all odd digits except divisible by 3 of any 4 digit number.
public class Assignment1_6c 
{
    public static void main(String[] args)
    {
        int num=1234;
        int sum_even,sum_odd;
        num=num%10;
        int num1=(num/10)%10;
        int num2=(num/100)%10;
        int num3=(num/1000)%10;

        sum_even=(num%2==0  && num%4!=0?num:0)+(num1%2==0 && num1%4!=0?num1:0)+(num2%2==0 && num2%4!=0?num2:0)+(num3%2==0  && num3%4!=0?num3:0);
        sum_odd=(num%2==1 && num%3!=0?0:num)+(num1%2==1 && num%3!=0?0:num1)+(num2%2==1 && num2%3!=0?0:num2)+(num3%2==1 && num3%3!=0?0:num3);
     
        float avg_even=sum_even/4;
        float avg_odd=sum_odd/4;

        System.out.println("Difference between average of all digits :"+(avg_even-avg_odd));
    }    
}
