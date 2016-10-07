import java.util.Scanner;
public class Lab_043Rectangle
	{
		static double l;
		static double w;
		static double p;
	
		public static void main(String[]args)
		{
			Scanner js = new Scanner(System.in);
	
			System.out.println("What is he length of your rectangle?:");
			l = js.nextDouble();
			System.out.println("What is the width of your rectangle?:");
			w = js.nextDouble();
			
			print(calcPerim(l, w));
		}
		
		public static double calcPerim(double l, double w)
		{
			return 2 * (l + w);
		}
		
		public static void print(double p)
		{
			System.out.printf("The perimeter of the rectangle is %5.5f", p);
		}
	}