import java.util.Scanner;
public class Magpie2Runner
{

	public static void main(String[] args)
	{
		Magpie2 mag = new Magpie2();
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

