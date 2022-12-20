// 1)WAP to create a list of prime Fibonacci series between user defined range and default range is 10 to 50 using interface?
import java.util.*;

interface IfindList {
    
    public void displayPrime();
    public void displayFibonacci();
}
class FindListImplement implements IfindList {
    int start=10 , end = 50;

    public FindListImplement() {
    }
    public FindListImplement(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void displayPrime() {
        System.out.println("displayPrime()");
        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
    public void displayFibonacci() {
        System.out.println("displayFibonacci()");
        int a = 0, b = 1, c = 0;
        System.out.print(a + " " + b + " ");
        while (c <= end) {
            c = a + b;
            if (c >= start && c <= end) {
                System.out.print(c + " ");
            }
            a = b;
            b = c;
        }
    }

}
 class Assignment4_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start and end range");
        int start = sc.nextInt();
        int end = sc.nextInt();
        FindListImplement obj = new FindListImplement(start, end);
        obj.displayPrime();
        obj.displayFibonacci();
        System.out.println("\n==============================");
        FindListImplement obj1 = new FindListImplement(10, 50);
        obj.displayPrime();
        obj.displayFibonacci();
    }
}
