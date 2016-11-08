import java.util.Scanner;
public class Lab_61Song
{
	public static void main(String[]args)
	
	{
		song("Na ", 4);
		song("Na ", 4);
		song("Hey ", 3);
		song("Goodbye!", 1);
	}
	public static void song(String word, int repeat)
	{
		for (int i = 1; i <= repeat; i++)
		{
			System.out.print(word + " ");
		}
		System.out.println();
	}
}