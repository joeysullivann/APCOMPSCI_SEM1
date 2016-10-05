public class Lab_05E1
{
	public static void main (String[]args)
	{
		int number = (int)((Math.random()* 6 + 1));
		int random = (int)((Math.random()* 6 + 1));
		String winner = rollDice(number, random);
		System.out.println("You rolled a " + number);
		System.out.println("Computer rolled a " + random);
		System.out.println("The winner is " + winner);
	}
	public static String rollDice(int number, int random)
	{
		if(number > random)
			return "you!";
		if(random > number)
			return "computer!";
		return "no one. ";
	}
}