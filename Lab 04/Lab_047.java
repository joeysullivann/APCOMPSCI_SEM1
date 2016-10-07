import java.util.Scanner;
public class Lab_047
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	
	{
		Scanner js = new Scanner(System.in);
		System.out.println("What is the length of the radius? ");
		r = js.nextDouble();
		
		area = 3.14*(r*r);
		System.out.println("The area of a cirle with a radius of" + r + "is " + area);
	}
}