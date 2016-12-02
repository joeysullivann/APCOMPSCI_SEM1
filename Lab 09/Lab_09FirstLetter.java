import java.util.Scanner;
public class Lab_09FirstLetter{
	public static void main(String[]args){
		String [] letter = new String[5];
		Scanner js = new Scanner(System.in);
		System.out.println("Enter in your five words:");
		for (int j = 0; j < letter.length; j++){
			letter[j] = js.next();
		}
		System.out.println("\nFirst letters of your words:");
		first(letter);
	}
	public static String first(String[] first){
		for (String let : first){
				System.out.println(let.charAt(0));
			}
			return "";
	}
}
