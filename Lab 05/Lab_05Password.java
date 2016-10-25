import java.util.Scanner;

public class Lab_05Password
{
	static String staticUsername = "Joey";
	static String staticPassword = "Sullivan";
	public static void main(String[]args)
	{
		passCheck();
	}
	public static void passCheck()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your username?");
		String inputUsername = input.nextLine();
		System.out.println("What is your password?");
		String inputPassword = input.nextLine();
		
		if ((inputUsername.equals(staticUsername)) && (inputPassword.equals(staticPassword)))
		{
			System.out.println("Correct!");
		}
		
		if (!(inputUsername.equals(staticUsername)) && (inputPassword.equals(staticPassword)))
		{
			System.out.println("Your username is incorrect!");
			passCheck();
		}
		
		if ((inputUsername.equals(staticUsername)) && !(inputPassword.equals(staticPassword)))
		{
			System.out.println("Your password is incorrect!");
			passCheck();
		}
		
		if (!(inputUsername.equals(staticUsername)) && !(inputPassword.equals(staticPassword)))
		{
			System.out.println("Your username and password are incorrect!");
			passCheck();
		}
	}
}