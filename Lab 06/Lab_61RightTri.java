import java.util.Scanner;
public class Lab_61RightTri
{
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String triangle = js.nextLine();
		for (int i = triangle.length()-1; i >=0 ; i--)
		{
			System.out.println(triangle.substring(i));
		}
	}
}