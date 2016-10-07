import java.util.Scanner;
public class Lab_043Average
	{
		static double num1;
		static double num2;
		static double num3;
		static double average;
	
		public static void main(String[]args)
		{
			Scanner js = new Scanner(System.in);
	
			System.out.println("What is your first number?");
			num1 = js.nextDouble();
			System.out.println("What is your second number?");
			num2 = js.nextDouble();
			System.out.println("What is your third number?");
			num3 = js.nextDouble();
			
			print(calcAverage(num1, num2, num3));
		}
		
		public static double calcAverage(double num1, double num2, double num3)
		{
			return (num1 + num2 + num3)/3;
		}
		
		public static void print(double avg)
		{
			System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is %5.5f", avg);
		}
	}