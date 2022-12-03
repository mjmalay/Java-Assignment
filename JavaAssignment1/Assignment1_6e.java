/*6(e). Write a program to find sum of product of consecutive odd digits of any 4 digit number ? supooose num =1356
 *  then output=5*3+3*1
 */
public class Assignment1_6e
{
    public static void main(String[] args) 
    {
        int num=1356,d1=0,d2=0,od1,od2;
        int d3=0,d4=0,od3,od4;
        d1=num%10;
        num=num/10;
        d2=num%10;
        num=num/10;
        d3=num%10;
        num=num/10;
        d4=num%10;

        od1=(d1%2!=0)?d1:0;                 
        od2=(d2%2!=0)?d2:0; 
        od3=(d3%2!=0)?d3:0;
        od4=(d4%2!=0)?d4:0;    

        int sum=(od2*od3)+(od3*od4);

        System.out.println("Sum of consecutive odd number is ="+sum);
    }    
}
