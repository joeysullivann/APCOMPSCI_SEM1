import java.util.Scanner;
public class Lab06_Box{
	public static void main(String[]args){
		Scanner js = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String numS = js.nextLine();
		int mathS = numS.length();
		for (int j = 1; j <= mathS; j++){
			System.out.println(numS);
		}
	}
}