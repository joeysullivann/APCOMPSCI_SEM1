import java.util.Scanner;
public class Lab_61Count
{
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println("Enter the number you want to count up to:");
		int count = js.nextInt();
		System.out.println("Enter the number you want to count by:");
		int by = js.nextInt();
		for (int j = by; j <= count; j += by)
		{
			System.out.println(j);
		}
	}
}