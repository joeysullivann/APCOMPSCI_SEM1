import java.util.Scanner;
public class Lab_09ReverseWord{
	static String newWord = "";

	public static void main(String[]args){
		String [] word = new String[5];
		Scanner js = new Scanner(System.in);
		System.out.println("Enter in your five words:");
		int lang = word.length;
		for (int j = 0; j < word.length; j++){
			word[j] = js.next();
		}
		System.out.println("Given order:");
		for (String wording : word){
			System.out.println(wording);
		}
		System.out.println("");
		System.out.println("Reversed:");
		reverse(word, lang);
	}
	public static String reverse(String[] w, int num){	
		for (int j = num - 1; j >= 0; j --){
			newWord = w[j];
			System.out.println(newWord);
		}
		return "";
	}
}
