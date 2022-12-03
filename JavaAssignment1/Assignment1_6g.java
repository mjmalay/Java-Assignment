/*6(g). Write a program to find sum of product of corresponding even digits of first any digit number and corresponding odd
 * digit of any 4 digit number .Such as n=1234 m=4567 output 4*7+2*5.
 */

public class Assignment1_6g {
    public static void main(String[] args) {
        int n = 1234, m = 4567;
        int d1, d2, d3, d4;
        int ed1, ed2, ed3, ed4, od1, od2, od3, od4;

        d1 = n % 10;
        n = n / 10;
        d2 = n % 10;
        n = n / 10;
        d3 = n % 10;
        n = n / 10;
        d4 = n % 10;

        ed1 = (d1 % 2 == 0) ? d1 : 0;
        ed2 = (d2 % 2 == 0) ? d2 : 0;
        ed3 = (d3 % 2 == 0) ? d3 : 0;
        ed4 = (d4 % 2 == 0) ? d4 : 0;

        d1 = m % 10;
        m = m / 10;
        d2 = m % 10;
        m = m / 10;
        d3 = m % 10;
        m = m / 10;
        d4 = m % 10;

        od1 = (d1 % 2 != 0) ? d1 : 0;
        od2 = (d2 % 2 != 0) ? d2 : 0;
        od3 = (d3 % 2 != 0) ? d3 : 0;
        od4 = (d4 % 2 != 0) ? d4 : 0;

        int sum = (ed1 * od1) + (ed3 * od3);

        System.out.println("Sum of product both even and odd is =" + sum);

    }
}
