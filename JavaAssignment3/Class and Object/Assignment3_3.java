/*3) Write a program to find area and perimeter of rectangle using class and object? */

class Rectangle
{
    float ln;
    float br;
    Rectangle(float ln,float br)
    {
        this.ln=ln;
        this.br=br;
    }
    public double area()
    {
        float R_area;
        R_area=ln*br;
        return R_area;
    }
    public double perimeter()
    {
        float R_perimeter;
        R_perimeter=2*(ln+br);
        return R_perimeter;
    }
}


public class Assignment3_3
{
    public static void main(String[] args) {
    Rectangle rt=new Rectangle(4,5);
    System.out.println("The area of Rectangle is :"+rt.area());
    System.out.println("The perimeter of Rectangle is: "+rt.perimeter());
    }
}
