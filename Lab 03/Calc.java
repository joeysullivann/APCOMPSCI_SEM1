import java.util.Scanner;

public class Calc
{
	public static void main(String[]args)
	{
		Scanner square = new Scanner(System.in);
		System.out.println("What is the length of your square?");
		double length = square.nextInt();
		double area = (length * length);
		System.out.println("The area of your squar is " + area);
	}
}