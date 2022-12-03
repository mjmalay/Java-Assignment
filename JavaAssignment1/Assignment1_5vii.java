/*Write a java program  to find left shift,right shift,and zero fill of summation of all digits of any 4 digits number 
 * and it will be shifted by 3rd digit of any 4 digit number.
 */

public class Assignment1_5vii 
{
    public static void main(String[] args)
    {
       	int num=4567;
     	int leftshift,rightshift,sum,thirdnum,zerofill;
	    sum=num%10+(num/10)%10+(num/100)%10+(num/1000)%10;
   	    thirdnum=(num/10)%10;
        leftshift=sum<<thirdnum;
	    rightshift=sum>>thirdnum;
	    zerofill=sum>>>thirdnum;
	
	System.out.println("the sum of digits is = "+sum);
	System.out.println("the thirdnum digit is = "+thirdnum);
	System.out.println("the leftshift  digit is = "+leftshift);
	System.out.println("the rightshift digit is = "+rightshift);
	System.out.println("the zerofill digit is = "+zerofill);
	
    }    
}
