import java.util.Scanner;
public class Lab_11Strings{
	public static void main(String[]args){
		String [][] words = new String[4][4];
		Scanner js = new Scanner(System.in);
		for (int j = 0; j < words.length; j++){
			for (int s = 0; s < words[j].length; s++){
				System.out.println("Enter in your word:");
				words[j][s] = js.nextLine();
			}
		}
		for (int j = 0; j < words.length; j++){
			for (int s = 0; s < words[j].length; s++){
				System.out.print(words[j][s] + "\t\t");
			}
			System.out.println("");
		}
	}
}
