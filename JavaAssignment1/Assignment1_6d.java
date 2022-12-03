/*6(d). Write a program to find sum of product of consecutive even digits of any 4 digit number ? supooose num =1624
 *  then 4*2+2*6
 */

public class Assignment1_6d 
{
    public static void main(String[] args) 
    {
        int num=1624,d1=0,d2=0,ed1,ed2;
        int d3=0,d4=0,ed3,ed4;
        d1=num%10;
        num=num/10;
        d2=num%10;
        num=num/10;
        d3=num%10;
        num=num/10;
        d4=num%10;

        ed1=(d1%2==0)?d1:0;
        ed2=(d2%2==0)?d2:0; 
        ed3=(d3%2==0)?d3:0;
        ed4=(d4%2==0)?d4:0;    

        int sum=(ed1*ed2)+(ed2*ed3);

        System.out.println("Sum of consecutive even number is ="+sum);
    }    
}
