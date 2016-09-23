import java.util.Scanner;
public class Lab_043
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
			Lab_043 boom = new Lab_043();
		
		double h = 0;
		double l = 0;
		double w = 0;
		double v = 0;
		
		System.out.print("What is your height? ");
		h = input.nextDouble();
		
		System.out.print("What is your length? ");
		l = input.nextDouble();
		
		System.out.print("What is your width? ");
		w = input.nextDouble();
		
		v = h * l * w;
			double v1 = boom.v1(v);
			
		System.out.println("");
		System.out.println("The volume is "+ v+ " cubic inches");
			System.out.println("The volume in cubic feet is "+ v1);
			
	}
		public double v1 (double v)
		{
			return(v * 0.00057870);
		}
}

