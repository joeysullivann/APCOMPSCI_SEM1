import java.util.Scanner;
public class Lab_121Human2{
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("Hair:");
		String inhair = js.nextLine();
		System.out.println("Eye:");
		String ineyes = js.nextLine();
		System.out.println("Skin:");
		String inskin = js.nextLine();
		Lab_121Human obj = new Lab_121Human("black", "brown", "tan");
		System.out.println("My info:");
		System.out.println("Hair:\t" + obj.geth());
		System.out.println("Eye:\t" + obj.gete());
		System.out.println("Skin:\t" + obj.gets());
		obj.setAttributes(inhair, ineyes, inskin);
		System.out.println("\nFriend's info:");
		System.out.println("Hair:\t" + obj.geth());
		System.out.println("Eyes:\t" + obj.gete());
		System.out.println("Skin:\t" + obj.gets());
	}
}
