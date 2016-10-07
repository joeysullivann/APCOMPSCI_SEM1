import java.util.Scanner;
public class Lab_046
{
	static double si;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println(" What is your side length? ");
		si = js.nextInt();
		
		cA();
		print();
		
	}
	public static void cA()
	{
		sa = 6*si*si;
	}
	public static void print()
	{
		System.out.println("The surface area of your cube is " + sa);
	}
}