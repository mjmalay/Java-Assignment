/*5) Write a program to override sum method if arguments are numbers than it will add numbers or string than concat two strings using constructor overloading? */

public class Assignment3_5 
{
    public static int sum(int...n)
    {
        int s=0;
        for (int i : n) 
        {
            s+=i;
        }
        return s;
    }
    public static String sum(String...s)
    {
        String str="";
        for (String i : s) 
        {
            str+=i;
        }
        return str;
    }
    public static void main(String[] args) 
    {
        System.out.println("Sum of numbers : "+sum(1,2,3,4,5));
        System.out.println("Concatenation of strings : "+sum("Hello ", "World"));
    }  
}
