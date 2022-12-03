// 2. Write a java program to find simple interest
class Assignment1_2 
{
    public static void main(String[] args)
    {
        double amount=15000.00;
        int time =2;
        float rate=7.5f;
        double SI=0;

        System.out.println("The time is = "+time);
        System.out.println("The raye is = "+rate);
        System.out.println("The principal amount is = "+amount);
        SI=amount*rate*time;
        System.out.println("The simple Interest is= "+ SI);
    }    
}
