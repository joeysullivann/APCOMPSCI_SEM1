import java.util.Scanner;

public class BMI
{
	public static void main(String[]args)
	{
		Scanner BMI= new Scanner(System.in);
		System.out.println("What is your weight in lbs?");
		double weight = BMI.nextInt();
		System.out.println("What is your heigh in inches?");
		double height = BMI.nextInt();
		double both = (703 * weight)/(height * height);
		System.out.println("Your BMI is " + both);
	}
}