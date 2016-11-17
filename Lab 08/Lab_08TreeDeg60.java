import java.util.Scanner;
public class Lab_08TreeDeg60{
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("Enter your word:");
		String wInput = js.nextLine();
		tree(wInput, 0, wInput.length());
	}

	public static String tree(String w, int go, int stop){
		if (go <= stop){
			System.out.printf("%7s%n", w.substring(0, go));
			return tree(w, go + 1, stop);
		}
		return "";
	}
}