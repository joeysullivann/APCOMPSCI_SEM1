import java.util.Scanner;
public class Lab_044
{
	static double l;
	static double w;
	static double p;
	
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println("What is your length? ");
		l = js.nextInt();
		System.out.println("What is your width? ");
		w = js.nextInt();
		calcP();
		print();

	}
	
	public static void calcP()
	{
		p = (2*1 + 2*w);
	}
	
	public static void print()
	{
		
		System.out.println("Your rectangle is " + p + " ft around. ");
	}
}