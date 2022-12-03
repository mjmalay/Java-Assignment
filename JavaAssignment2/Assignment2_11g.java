/*11. Write a program to perform following using the numbers in between 23 to 249?
		g) find GCD and LCM of all odd numbers?
*/

public class Assignment2_11g
{
    public static void main(String[] args) 
	{
		int LCM = 1, GCD1 = 1, GCD2 = 1;
		int a = 23;
		for (int i = 25; i <= 249; i = i + 2) 
		{
			for (int j = i; j >= 1; j--) 
			{
				if (a % j == 0 && i % j == 0) 
				{
					GCD1 = j;
					break;
				}
			}
			for (int j = i; j >= 1; j--) 
			{
				if (LCM % j == 0 && i % j == 0) 
				{
					GCD2 = j;
					break;
				}

			}
			LCM = (LCM * i) / GCD2;
			a = GCD1;
		}
		System.out.println("LCM = " + LCM + " GCD =" + GCD1);
	}
}
