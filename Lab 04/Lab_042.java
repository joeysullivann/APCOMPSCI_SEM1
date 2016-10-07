import java.util.Scanner;
public class Lab_042
{
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		
		double p = 0;
		double r = 0;
		double t = 0;
		double cI = 0;
		
		System.out.print("What is your principal amount? ");
		p = js.nextDouble();
		
		System.out.print("What is the rate of loan? ");
		r = js.nextDouble();
		
		System.out.print("What is the life of the loan in years?");
		t = js.nextDouble();
		
		cI = p = Math.pow((1 + r/100),t);
		
		System.out.println("");
		System.out.println("Your total monthly payment is "+ cI);
	}
}