/* 7) Write a program to find volume of rectangle and square box using constructor overloading */
import java.util.Scanner;
class Test
{
        public float volume(float side)
        {
            float vol=side*side*side;
            return vol;
        }
        public float volume(float ln,float w,float h)
        {
            float vol=ln*w*h;
            return vol;
        }
}
public class Assignment3_7 
{
    public static void main(String args[])
    {
        Test t=new Test();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the Square :");
        float side=sc.nextFloat();
        System.out.println("Enter the length,width and height of rectangle :");
        float ln,w,h;
        ln=sc.nextFloat();
        w=sc.nextFloat();
        h=sc.nextFloat();
        float square=t.volume(side);
        float rectangle=t.volume(ln,w,h);
        System.out.println("Volume of square: "+square);
        System.out.println("Volume of rectangle "+rectangle);

    }    
}
