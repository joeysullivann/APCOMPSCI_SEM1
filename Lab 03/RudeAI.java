import java.util.Scanner; //import Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name? ");
		String mouse = keyboard.next();
		System.out.println("Wow! " + mouse + " is a cool name!");
		
		Scanner monitor = new Scanner(System.in);
		System.out.println("How old are you? ");
		int age = monitor.nextInt();
		System.out.println("Wow! " + age + " is a great number!");
		
		Scanner keys = new Scanner(System.in);
		System.out.println("What do you do for fun?" );
		String door = keys.nextLine();
		System.out.println("That sounds super fun! ");
		
		Scanner movie = new Scanner(System.in);
		System.out.println(" What kind of music do you like? ");
		String actor = movie.nextLine();
		System.out.println("I love that type of music!");
		
		Scanner sister = new Scanner(System.in);
		System.out.println(" How many siblings do you have? ");
		int brother = sister.nextInt();
		System.out.println(brother + " is a cool number!");
		
		Scanner grow = new Scanner(System.in);
		System.out.println("What do you want to be when you grow up");
		String up = grow.nextLine();
		System.out.println("Cool!" + up + " is a cool thing to be!");
	}
}