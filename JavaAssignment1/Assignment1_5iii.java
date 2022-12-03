/*5(iii). Write a program to find the value at position rewuired by the user it may be 10,100 or 1000 . */

public class Assignment1_5iii 
{
    public static void main(String[] args)
    {
        int num=1234; 
        int thousands,hundreds,tens;
        tens=(num/10)%10;
        hundreds=(num/100)%10;
        thousands=num/1000;

        System.out.println("The Value of 10th position is ="+ tens);
        System.out.println("The Value of 100th position is ="+ hundreds);
        System.out.println("The Value of 1000th position is = ="+ thousands);
        
    }    
}
