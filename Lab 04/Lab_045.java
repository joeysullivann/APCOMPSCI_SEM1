import java.util.Scanner;
public class Lab_045
{
	static double b;
	static double c;
	static double d;
	static double a;
	
	public static void main(String[]arg)
	
	{
		Scanner js = new Scanner (System.in);
		System.out.println("What is your first number? ");
		b = js.nextInt();
		
		System.out.println(" What is your second number? ");
		c = js.nextInt();
		
		System.out.println("What is your last number? ");
		d = js.nextInt();
		calcAvg();
		print();
	}
	public static void calcAvg()
	{
		a = (b + c+d)/3;
	}
	public static void print()
	{
		System.out.println("Your average is " + a);
	}
}