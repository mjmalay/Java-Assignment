//5(V). find sum of product of corresponding digits of two any 4 digit number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1


class Assignment1_5v 
{
    public static void main(String[] args) 
    {
        int m=7896,n=1234;
        int sum=0;

        sum=((m%10)*(n%10))+((m/10)%10)*((n/10)%10)+(((m/100)%10)*((n/100)%10))+(((m/1000)%10)*((n/1000)%10));

        System.out.println("Sum of product of corresponding digits ="+sum);
    }    
}
