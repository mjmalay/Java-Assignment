/*4) Write a program to find area and perimeter of square using class and object? */

class Square
{
    float a;
    Square(float a)
    {
        this.a=a;
    }
    double area()
    {
        double area_ofsquare=a*a;
        return area_ofsquare;
    }
    double perimeter()
    {
        double permiterOfsq=4*a;
        return permiterOfsq;
    }
}

public class Assignment3_4 
{
      public static void main(String[] args) {
        Square s =new Square(6);
       
        System.out.println("Area of the square is: "+s.area());
        System.out.println("perimeter of the square is: "+s.perimeter());
      }
}
