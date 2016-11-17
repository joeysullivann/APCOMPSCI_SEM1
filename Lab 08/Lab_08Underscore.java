import java.util.Scanner;
public class Lab_08Underscore{
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("Enter in your string: ");
		String sentence = js.nextLine();
		System.out.println(replace(sentence));
	}
	public static String replace(String sent){
		if (sent.indexOf(" ") > 0){
			sent = sent.substring(0, sent.indexOf(" ")) + "_" + sent.substring(sent.indexOf(" ")+ 1);
			return replace(sent);
		}
		else{
			return sent;
		}
	}
}