import java.util.Scanner;

public class Lab_05BMI
{
	static String fitness;
	static String bmi;
	
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println("What is your height in inches? ");
		double h = js.nextDouble();
		System.out.println("What is your weight in pounds? ");
		double w = js.nextDouble();
		double bmi = (703*w)/(h*h);
		System.out.printf("Your BMI is %3.2f", bmi);
		System.out.println("\nYou are:" + fitnessbmi(bmi));
		
	}
	public static String fitnessbmi(double bmi)
	{
		if (bmi > 39.9)
		{
			fitness = "Morbidly Obese";
		}
		
		else if(bmi >= 35)
		{
			fitness = "Very Obese";
		}
		
		else if(bmi >= 29.9)
		{
			fitness = "Obese";
		}
		
		else if(bmi >= 25)
		{
			fitness = "Overweight";
		}
		
		else if(bmi >= 18.5)
		{
			fitness = "Normal weight";
		}
		
		else
		{
			fitness = "Underweight";
		}
		
		return fitness;
	}
}