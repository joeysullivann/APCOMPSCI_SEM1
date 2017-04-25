import java.util.Scanner;
public class Magpie3Runner
{
	public static void main(String[] args)
	{
		Magpie3 mag = new Magpie3();
		System.out.println (mag.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		while (!statement.equals("Bye"))
		{
			System.out.println (mag.getResponse(statement));
			statement = in.nextLine();
		}
	}

}