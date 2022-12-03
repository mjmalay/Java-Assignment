
//1) Write a program to find average and also find total no. of odd, even, prime and palindrome number available in an array of 30 user defined numbers?

public class Assignment3_1 
{
    public static void main(String[] args) {
        int arr[]={10,5,7,3,6,9,65,87,23,45,87,56,43,12,34,90,67,45,23,63,14,15,31,26,68,39,38,27,30,69};
        int sum=0,odd=0,even=0,prime=0,palindrome=0;
        int count=0;
        float avg;
        for(int i=0;i<30;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/30;
        System.out.println("The average of 30 number: "+avg);
        for(int i=0;i<30;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Total number of even number is : "+even);
        System.out.println("Total number of odd number is : "+odd);
        int num,n,pal=0,t_pal=0;

        for(int i=0;i<30;i++)
        {
            int temp=arr[i];
            while(arr[i]>0)
            {
                num=arr[i]%10;
                pal=pal+num*10;
                num=num/10;

            }
            if(temp==pal)
            {
                t_pal++;
            }
        }
        System.out.println("The total number of palindrome number is : "+t_pal);
       
    }
}
