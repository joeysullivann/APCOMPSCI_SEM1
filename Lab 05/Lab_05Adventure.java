import java.util.Scanner;

public class Lab_05Adventure
{
	static public void main(String[]args)
	{
		Scanner js = new Scanner(System.in);
		System.out.println(" The house across the street has been abandoned for years. You have two options. '1' , stay downstairs or '2' , go upstairs. Please enter 1 or 2.");
		double choice1 = js.nextDouble();
		if (choice1 == 1)
		{
			System.out.println("You go down the long narrow hallway. The paintings on the wall seem to be staring at you, watching your every move. At the end of the hallway there is another room with a closed door. ");
			System.out.println("Do you want to '1' open the door and see whats inside or '2' run away and go home.");
			double choice12 = js.nextDouble();
			
			if (choice12 == 1)
			{
				System.out.println("You open the door and find a hobo living in the house. He has a knife and looks aggressive.");
				System.out.println("Do you want to '1' fight the hobo or '2' flee.");
				double choice121 = js.nextDouble();
				
				if (choice121 == 1)
				{
					System.out.println("You fight the hobo and win! You exit the house, never to return again.");
				}
				
				if (choice121 == 2)
				{
					System.out.println("You flee from the hobo and the hobo catches up to you and stabs you to your death.");
				}
			}	
			
			if (choice12 == 2)
			{
				System.out.println("You flee the house but trip on the way out. Your ankle is broken.");
				System.out.println("Do you '1' scream for help or '2' get up and keep running through the pain.");
				double choice122 = js.nextDouble();
				
				if (choice122 == 1)
				{
					System.out.println("You scream for help, the hobo catches up and stabs you to your death.");
				}
				
				if (choice122 == 2)
				{
					System.out.println("You get back up and keep running, you run into your house and survive, never to enter the house again.");
				}
			}
			
		}
		if (choice1 == 2)
		{
			System.out.println("You go upstairs. The stairs seem very unstable, you reach the last step and the whole staircase collapses. You are now stuck at the top of the staircase.");
			System.out.println("Do you '1' jump down or '2' scream for help.");
			double choice22 = js.nextDouble();
			
			if (choice22 == 1)
			{
				System.out.println("You jump down and survive the fall. You walk out of the house and never return.");
				
			}
			
			if (choice22 == 2)
			{
				System.out.println(" You scream for help, and a hobo upstairs heres you. He runs at you with an axe.");
				System.out.println("Do you '1' fight the hobo or '2' jump down.");
				double choice222 = js.nextDouble();
				
				if (choice222 == 1)
				{
					System.out.println("You fight the hobo and he chops you in half. ");
				}
				
				else
				{
					System.out.println("You jump down, but land weirdly and die.");
				}
			}
		}
	}
}