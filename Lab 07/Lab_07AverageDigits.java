import java.util.Scanner;
public class Lab_07AverageDigits
{
	static double number = 0;
	static double add = 0;
	static double average = 0;
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println("Enter in your number: ");
		int number = js.nextInt();
		int num = number;
		System.out.println("The average of the digits in " + number + " is " + avDigits(num));
		
	}
	public static double avDigits(int num)
	{
		while (num > 0)
		{
			num+= 1;
			add += num % 10;
			num /= 10;
		}
		return (add/num);
	}
}