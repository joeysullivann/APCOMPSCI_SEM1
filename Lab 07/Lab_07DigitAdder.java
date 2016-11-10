import java.util.Scanner;
public class Lab_07DigitAdder
{
	static int number;
	static int sum = 0;
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println("Enter in your number: ");
		int number = js.nextInt();
		int num = number;
		System.out.println("The sum of the digits in " + number + " is " + sumDigits(num));
	}
	public static int sumDigits(int num)
	{
		while (num > 0)
		{
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
	


}