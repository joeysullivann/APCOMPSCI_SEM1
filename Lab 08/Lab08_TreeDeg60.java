import java.util.Scanner;
public class Lab_08TreeDeg60
{
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("Enter your word:");
		String wordInput = js.nextLine();
		tree(wordInput, 0, wordInput.length());
	}

	public static String tree(String word, int start, int stop){
		if (start <= stop){
			System.out.printf("%7s%n", word.substring(0, start));
			return tree(word, start + 1, stop);
		}
		return "";
	}
}