import java.util.Scanner;
public class Lab_111Health{
	static String [] heal = new String[6];
	static int hp = 6;
	static int health = 6;
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		while (!turn.equals("Q") && health > 0){
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = js.nextLine();
			damage = 1 + (int)((Math.random()*6));
			amount = 1 + (int)((Math.random()*6));
			takeDamage(damage, amount);
			printclip();
		}
		System.out.println("You died!");
	}
	public static String takeDamage(int dmg, int amt){
		if (dmg == 1){
			health -= amt;
			System.out.println("Taking " + amt + " damage!");
		}
		else{
			if (health + dmg < hp)
			{
				health += hp;
			}
			else
			{
				health = hp;	
			}
		}
		return ("Power Up" + amt + "!");
	}
	public static void printclip(){
		String output = "Health: \t";
		for (int j = 0; j < hp; j++){
			if (j < health)
			{
				heal[j] = "@";
			}
			else{
				heal[j] = "[]";
			}
			output += heal[j];
		}
		System.out.println(output);
	}
}