/*5. WAP to create scientific calculator and perform all arithmetic operations like 
sum,substraction,division,multiplication,modulus,power,sqrt,cubic root, sinx, cos x, tanx, log 
x, exp x, absolute value of x using interface and package?  */

import java.util.Scanner;

interface IBasicCalaulator {
    public double sum(double...arr);
    public double substract(double...arr);
    public double multiply(double...arr);
    public double divide(double...arr);

}

class ScientificCalculator extends BasicCalculator {
    public double modulus(double x, double y){
        return x%y;
    }
    public double power(double x, double y){
        return Math.pow(x, y);
    }
    public double sqrt(double x){
        return Math.sqrt(x);
    }
    public double cubic(double x){
        return Math.cbrt(x);
    }
    public double sinx(double x){
        return Math.sin(x);
    }
    public double cosx(double x){
        return Math.cos(x);
    }
    public double tanx(double x){
        return Math.tan(x);
    }
    public double logx(double x){
        return Math.log(x);
    }
    public double exp(double x){
        return Math.exp(x);
    }
    public double absoluteValue(double x){
        return Math.abs(x);
    }
    
}


class BasicCalculator implements IBasicCalaulator 
{
    public double sum(double...arr){
        double s = 0;
        for(double i : arr){
            s += i;
        }
        return s;
    }
    public double substract(double...arr){
        double s = 0;
        for(double i : arr){
            s -= i;
        }
        return s;
    }
    public double multiply(double...arr){
        double s = 0;
        for(double i : arr){
            s *= i;
        }
        return s;
    }
    public double divide(double...arr){
        double s = 0;
        for(double i : arr){
            s /= i;
        }
        return s;
    }
}


class Assignment4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int f = sc.nextInt();
        System.out.println("Enter second Number: ");
        int s = sc.nextInt();
        ScientificCalculator cal = new ScientificCalculator();
        System.out.println(
            "1. Add operation"+
            "2. Substract operation"+
            "3. Multiplication operation"+
            "4. Division operation"+
            "5. Power operation"+
            "6. Sinx operation"+
            "7. Cos x operation"+
            "8. Tan x operation"+
            "9. Log x operation"+
            "10. Square root operation"+
            "11. Cube root operation");
        System.out.println("Enter operation: ");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println(cal.sum(f,s));
                break;
            case 2:
                System.out.println(cal.substract(f,s));
                break;
            case 3:
                System.out.println(cal.multiply(f,s));
                break;
            case 4:
                System.out.println(cal.divide(f,s));
                break;
            case 5:
                System.out.println(cal.power(f,s));
                break;
            case 6:
                System.out.println(cal.sinx(f));
                break;
            case 7:
                System.out.println(cal.tanx(f));
                break;
            case 8:
                System.out.println(cal.logx(f));
                break;
            case 9:
                System.out.println(cal.sqrt(f));
                break;
            case 10:
                System.out.println(cal.cubic(f));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        
        }
    
    }
    
}
