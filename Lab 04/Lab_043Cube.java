import java.util.Scanner;
public class Lab_043Cube
	{
		static double s;
		static double sa;
	
		public static void main(String[]args)
		{
			Scanner js = new Scanner(System.in);
	
			System.out.println("What is your length of a side?");
			s = js.nextDouble();
			
			print(calcSA(s));
		}
		
		public static double calcSA(double s)
		{
			return 6 * s * s;
		}
		
		public static void print(double sa)
		{
			System.out.printf("The SA or a cube with side lengths " + s + " is %5.5f", sa);
		}
	}