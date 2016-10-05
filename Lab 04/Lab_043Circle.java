import java.util.Scanner;
public class Lab_043Circle
	{
		static double r;
		static double a;
	
		public static void main(String[]args)
		{
			Scanner inputs = new Scanner(System.in);
	
			System.out.println("What is the radius of your circle?");
			r = inputs.nextDouble();
			
			print(calcArea(r));
		}
		
		public static double calcArea(double r)
		{
			return 3.14159 * r * r;
		}
		
		public static void print(double area)
		{
			System.out.printf("The area of a circle with a radius of " + r + " is %5.5f", a);
		}
	}