/*1. Write a java program to find following using looping and decision making 
without function
            X. Sum of product of consecutive prime digits of any digit numbe*/


import java.util.Scanner;
public class Assignment2_1x
{
    public static void main(String[] args) 
    {
        int num,i,j,sumOfProduct=0,prime1,prime2;
        Scanner sc=new Scanner(System.in);;
        System.out.println("Enter any digit number : ");
        num=sc.nextInt(); 
        while(num>0)
        {
            prime1 = prime2 = 0;
            i=num%10;
            j=(num/10)%10;
            for(int k = 2; k < 9; k++){
                if(i > k && i%k == 0){
                    prime1++;
                    break;
                }
                if(j > k && j%k == 0){
                    prime2++;
                    break;
                }
            }
            if(prime1 == 0 && prime2 == 0){
                sumOfProduct += i * j;
            }
            num /= 10;
        }    
        System.out.println("Sum of product of all consecutive digits: "+sumOfProduct);
    }    
}
