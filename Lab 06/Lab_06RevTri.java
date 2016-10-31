import java.util.Scanner;
public class Lab_06RevTri
{
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String triangle = js.nextLine();
		int lengthtangle = triangle.length();
		for(int i = lengthtangle; i >= 1; i--)
		{
			System.out.println(triangle.substring(0,i));
		}
		
	}
}