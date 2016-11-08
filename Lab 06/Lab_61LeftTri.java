import java.util.Scanner;
public class Lab_61LeftTri
{
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String triangle = js.nextLine();
		for (int i = 0; i <= triangle.length(); i++)
		{
			System.out.println(triangle.substring(i));
		}
		
	}
}