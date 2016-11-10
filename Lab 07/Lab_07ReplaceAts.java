import java.util.Scanner;
public class Lab_07ReplaceAts
{
	static String inJls = " ";
	public static void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println("Enter in your sentence: ");
		String inJls = js.nextLine();
		while (inJls.indexOf("a") >= 0)
		{
			inJls = inJls.substring(0, inJls.indexOf("a")) + "@" + inJls.substring(inJls.indexOf("a") + 1);
			
		}
		System.out.println(inJls);
	}
}