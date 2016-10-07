import java.util.Scanner;
public class Lab_048
{
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		Lab_048 boom = new Lab_048();
		
		double h = 0;
		double l = 0;
		double w = 0;
		
		double v = 0;
		
		System.out.println("What is your height? ");
		h = js.nextDouble();
		
		System.out.println("What is your length? ");
		l = js.nextDouble();
		
		System.out.println("What is your width? ");
		w = js.nextDouble();
		
		v = h * l * w;
		double v1 = boom.v1(v);
		
		System.out.println("");
		System.out.println("The volume is "+ v+ " cubic inches");
		System.out.println("The volume in cubic feet is " + v1);
	}
	public double v1 (double v){
	return(v * 0.00057870);
	}
}