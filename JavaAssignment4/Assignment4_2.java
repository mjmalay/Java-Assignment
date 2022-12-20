/*2. WAP to check weather a number is Armstrong number or not using custom exception and interface? 
 */

import java.util.*;
import java.lang.*;
interface Armstrong
{
    void CheckAmstrong(int num) throws Test3;
}
class Test3 extends Exception
{
    Test3(String sts)
    {
        super(sts);
    }

}
 class Assignment4_2 implements Armstrong
{
    public static void main(String[] args) {
        Assignment4_2 a=new Assignment4_2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is armstrong or not :");
        int num=sc.nextInt();
       try {
        a.CheckAmstrong(num);
       } catch (Test3 e) {
          e.printStackTrace();
       }
    }
    public void CheckAmstrong(int num) throws Test3 
    {
        int rem,result=0;
        int temp=num;
            while(num>0)
            {
                rem=num%10;
                result=result+(rem*rem*rem);
                num=num/10;
            }
            if(result==temp)
            {
                throw new Test3(temp+"is an armstrong number");
            }else{
                throw new Test3(temp+"Is not an amstrong number");
            } 
       
    }
}
