import java.util.Scanner;
public class Lab_06Factorial
{
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = js.nextInt();
		System.out.println(calcnumber(number));
	}
	static int calcnumber (int number)
	{
		int f = 1;
		for (int i =1; i <= number; i++)
		{
			f = f*i;
		}
		return f;
	}
}