import java.util.Scanner;
public class Lab06_Box
{
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String numS = js.nextLine();
		int mathS = numS.length();
		for (int i = 1; i <= mathS; i++)
		{
			System.out.println(numS);
		}
	}
}