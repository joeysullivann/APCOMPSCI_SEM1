import java.util.Scanner;
 public class MagpieRunner
 {
 	public static void main(String[] args)
 	{
 		Magpie mag = new Magpie();
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
